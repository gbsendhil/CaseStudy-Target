package com.target.dealbrowserpoc.dealbrowser.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    public static String BASE_URL = "http://target-deals.herokuapp.com/";

    private static Retrofit retrofit = null;

    private static ApiInterface apiInterface;

    private ApiClient() {

    }

    public static ApiInterface getApiInterface() {
        if (null == apiInterface) {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();
                apiInterface = retrofit.create(ApiInterface.class);
            }
        }

        return apiInterface;
    }

}
