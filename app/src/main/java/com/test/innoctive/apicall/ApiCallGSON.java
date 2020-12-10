package com.test.innoctive.apicall;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiCallGSON {

    @Headers({"Content-Type: application/json", "Accept-Charset: utf-8"})


    @GET("users")
    public Call<ResponseBody> transactioncall();


}
