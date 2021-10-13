package com.example.covid19tracker;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    //retrofit is used for fetching data from api
    String BASE_URL="https://corona.lmao.ninja/v2/";//This is base url of api

    @GET("countries")
    Call<List<ModelClass>>getcountrydata();
}
