package com.example.ravi.network;

import com.example.ravi.network.model.Example;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MyService {

    @FormUrlEncoded
    @POST("healthtips.php")
    Single<Example> getHealthTips(@Field("lastcount") String lastcount, @Field("userid") String userid);
}
