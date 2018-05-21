package com.target.dealbrowserpoc.dealbrowser;

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
import com.target.dealbrowserpoc.dealbrowser.network.ApiClient;
import com.target.dealbrowserpoc.dealbrowser.util.Products;
import com.target.dealbrowserpoc.dealbrowser.model.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

    private static final String TAG = "MainFragment";

    // Data binding
    FragmentMainBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentMainBinding.inflate(inflater);
        mBinding.swipeRefreshLayout.setOnRefreshListener(this);

        setupProductsList();
        return mBinding.getRoot();
    }



    private void setupProductsList(){


        ApiClient.getApiInterface().getDeals().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    List<Product> productList = new ArrayList<>();
                    for(Data item : response.getData()){

                        //TODO Use JAVA8 streams to map the data to the required place holder and change target API level 24
                        //System.out.println(item.getDescription());
//                        Product newProduct = new Product(item.getIndex(),item.get_id(), item.getTitle(), item.getDescription(),
//                                new BigDecimal(item.getPrice()), new BigDecimal(item.getSalePrice()),item.getImage(),item.getAisle());
//                        productList.add(newProduct);
                    }
                    //mBinding.setProducts(productList);
                });

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














