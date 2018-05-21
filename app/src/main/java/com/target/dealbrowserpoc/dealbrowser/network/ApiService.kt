package com.target.dealbrowserpoc.dealbrowser.network

import com.target.dealbrowserpoc.dealbrowser.model.DealItem
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import rx.Observable

interface ApiService {
    @GET
    fun getDeals(): Observable<DealItem>

    companion object {
        fun create(): ApiService {

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(
                            RxJavaCallAdapterFactory.create())
                    .addConverterFactory(
                            GsonConverterFactory.create())
                    .baseUrl("http://target-deals.herokuapp.com/api/")
                    .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}