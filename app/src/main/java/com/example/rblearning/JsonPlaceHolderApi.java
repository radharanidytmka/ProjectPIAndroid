package com.example.rblearning;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("user")
    Call<List<Post>> getPosts();

}
