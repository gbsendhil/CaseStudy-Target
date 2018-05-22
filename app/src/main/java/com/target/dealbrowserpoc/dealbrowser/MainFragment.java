package com.target.dealbrowserpoc.dealbrowser;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.target.dealbrowserpoc.dealbrowser.adapters.ProductsAdapter;
import com.target.dealbrowserpoc.dealbrowser.databinding.FragmentMainBinding;
import com.target.dealbrowserpoc.dealbrowser.models.Product;
import com.target.dealbrowserpoc.dealbrowser.models.ProductListViewModel;
import com.target.dealbrowserpoc.dealbrowser.util.Products;
import com.target.dealbrowserpoc.dealbrowser.model.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

    private static final String TAG = "MainFragment";

    // Data binding
    FragmentMainBinding mBinding;

    private ProductListViewModel productListViewModel;

    private final Observer<List<Data>> productListObserver = productList -> setupProductsList(productList);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentMainBinding.inflate(inflater);
        mBinding.swipeRefreshLayout.setOnRefreshListener(this);

        productListViewModel= ViewModelProviders.of(this).get(ProductListViewModel.class);
        productListViewModel.getProductList().observe(this,productListObserver);
        productListViewModel.fetchDeals();
        setupProductsList(null);
        return mBinding.getRoot();
    }



    private void setupProductsList(List<Data> productDataList){

        if(null!=productDataList){
            Log.d("XXX",productDataList.size()+"");
        }


        Products products = new Products();
        List<Product> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(products.PRODUCTS));
        mBinding.setProducts(productList);
    }


    @Override
    public void onRefresh() {
        Products products = new Products();
        List<Product> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(products.PRODUCTS));
        ((ProductsAdapter)mBinding.recyclervView.getAdapter()).refreshList(productList);
        onItemsLoadComplete();
    }

    void onItemsLoadComplete() {
        (mBinding.recyclervView.getAdapter()).notifyDataSetChanged();
        mBinding.swipeRefreshLayout.setRefreshing(false);
    }
}














