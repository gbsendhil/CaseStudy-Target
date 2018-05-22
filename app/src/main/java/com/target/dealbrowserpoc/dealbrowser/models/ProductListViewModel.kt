package com.target.dealbrowserpoc.dealbrowser.models

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

import com.target.dealbrowserpoc.dealbrowser.model.Data
import com.target.dealbrowserpoc.dealbrowser.network.ApiInterface
import rx.Scheduler

import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ProductListViewModel(val processScheduler : Scheduler = Schedulers.io(),
                           val androidScheduler: Scheduler=AndroidSchedulers.mainThread(),
                           val apiService:ApiInterface=ApiInterface.create()) : ViewModel() {

    val productList = MutableLiveData<List<Data>>()


    fun fetchDeals() {
        apiService.getDeals().subscribeOn(processScheduler)
                .observeOn(androidScheduler)
                .subscribe { (_, data) -> productList.setValue(data) }
    }
}
