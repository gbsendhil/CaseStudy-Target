package com.target.dealbrowserpoc.dealbrowser.network


import com.target.dealbrowserpoc.dealbrowser.model.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.http.GET
import rx.Observable

interface ApiInterface {
    @GET("api/deals")
    fun getDeals(): Observable<Response>

    companion object {
        fun create(): ApiInterface {

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(
                            RxJavaCallAdapterFactory.create())
                    .addConverterFactory(
                            GsonConverterFactory.create())
                    .baseUrl("http://target-deals.herokuapp.com/")
                    .build()

            return retrofit.create(ApiInterface::class.java)
        }
    }
}
