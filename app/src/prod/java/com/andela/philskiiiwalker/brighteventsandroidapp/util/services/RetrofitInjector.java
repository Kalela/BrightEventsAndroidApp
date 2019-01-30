package com.andela.philskiiiwalker.brighteventsandroidapp.util.services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInjector {
    private static HttpLoggingInterceptor interceptor =
            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient client =
            new OkHttpClient.Builder().addInterceptor(interceptor).build();

    public static Retrofit provideRetrofit(String baseUrl) {
        return  new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static AuthService provideUsersService() {
        return provideRetrofit("https://bright-events-api-.herokuapp.com/api/v2/auth/")
                .create(AuthService.class);
    }
}
