package com.target.dealbrowserpoc.dealbrowser.network;


import com.target.dealbrowserpoc.dealbrowser.model.Response;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiInterface {
    @GET("api/deals")
    Observable<Response> getDeals();
}
