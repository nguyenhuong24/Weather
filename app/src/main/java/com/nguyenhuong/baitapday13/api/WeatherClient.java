package com.nguyenhuong.baitapday13.api;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherClient {
    private WeatherClient(){
    }
    private static Retrofit INSTANCE;
    public static Retrofit getRetrofitClient(){
        if (INSTANCE==null){
            INSTANCE=new Retrofit.Builder().baseUrl("https://api.openweathermap.org/data/2.5/weather/").
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return INSTANCE;
    }

}
