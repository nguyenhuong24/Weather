package com.nguyenhuong.baitapday13.api;
import com.nguyenhuong.baitapday13.modal.WeatherForecasts;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("?units=metric&appid=59c696200a0d2d52c8602c665cc392b0&fbclid=IwAR0AfM1KuOQWk5dnF5Hw8KqgZ2CdNtUOPvWSfqAIh2F_2-Of0dbydkvEyNw")
    Call<WeatherForecasts> getWeather( @Query("q") String name);
}
