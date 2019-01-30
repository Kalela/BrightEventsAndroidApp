package com.andela.philskiiiwalker.brighteventsandroidapp.util.services;

import com.andela.philskiiiwalker.brighteventsandroidapp.registration.model.Users;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {

    @POST("register")
    Call<Users> registerUser(@Body Users user);
}
