package com.example.hsttpscheckingapi;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("GetUserWiseLoginTimeDetails")
    Call<ApiResponse> getUserWiseLoginTimeDetails();
}