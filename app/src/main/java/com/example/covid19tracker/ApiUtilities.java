package com.example.covid19tracker;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    public static Retrofit retrofit=null;

    public static ApiInterface getAPIInterface()
    {
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }//gson converter is used to convert json data into java
        return  retrofit.create(ApiInterface.class);
    }
}
