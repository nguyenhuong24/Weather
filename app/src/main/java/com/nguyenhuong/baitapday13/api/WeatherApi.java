package com.nguyenhuong.baitapday13.api;

public class WeatherApi   {
    private WeatherApi(){

    }
    public static WeatherService getService(){
        return WeatherClient.getRetrofitClient().create(WeatherService.class);
    }
}
