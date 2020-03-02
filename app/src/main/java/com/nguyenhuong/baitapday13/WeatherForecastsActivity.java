package com.nguyenhuong.baitapday13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.nguyenhuong.baitapday13.api.WeatherApi;
import com.nguyenhuong.baitapday13.modal.Weather;
import com.nguyenhuong.baitapday13.modal.WeatherForecasts;

import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherForecastsActivity extends AppCompatActivity {
    private TextView tvCity, tvDate, tvCountry, tvWeather, tvDgree, tvHumidity, tvCloud, tvWind;
    private ImageView imgSearch, imgWeather;
    private EditText edtSearch;
    private WeatherForecasts weatherForecasts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_forecasts);
        initViews();
    }
    private void initViews() {
        tvCity = findViewById(R.id.tv_city);
        tvCountry = findViewById(R.id.tv_country);
        tvCloud = findViewById(R.id.tv_cloud);
        tvWeather = findViewById(R.id.tv_weaather);
        tvWind = findViewById(R.id.tv_wind);
        tvHumidity = findViewById(R.id.tv_humidity);
        tvDgree = findViewById(R.id.tv_dgree);
        tvDate = findViewById(R.id.tv_date);
        imgWeather = findViewById(R.id.img_weather);
        edtSearch = findViewById(R.id.edt_search);
        imgSearch = findViewById(R.id.img_search);
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cityName=edtSearch.getText().toString();
                if (cityName.isEmpty()){
                    Toast.makeText(WeatherForecastsActivity.this, "please enter city name", Toast.LENGTH_SHORT).show();
                    return;
                }
                WeatherApi.getService().getWeather(cityName).enqueue(new Callback<WeatherForecasts>() {
                    @Override
                    public void onResponse(Call<WeatherForecasts> call, Response<WeatherForecasts> response) {
                        if (response.isSuccessful()){
                            weatherForecasts = response.body();
                            if (response != null) {
                                tvCity.setText(weatherForecasts.getName());
                                tvCountry.setText(weatherForecasts.getSys().getCountry());
                                tvDgree.setText(weatherForecasts.getMain().getTemp().toString());
                                tvCloud.setText(weatherForecasts.getClouds().getAll() + "%");
                                tvWind.setText(weatherForecasts.getWind().getSpeed().toString() + "km/h");
                                tvHumidity.setText(weatherForecasts.getMain().getHumidity() + "%");
                                Glide.with(WeatherForecastsActivity.this)
                                        .load("https://openweathermap.org/img/w/"
                                                + weatherForecasts.getWeather().get(0).getIcon() + ".png").into(imgWeather);
                                tvWeather.setText(weatherForecasts.getWeather().get(0).getMain());
                                long day = weatherForecasts.getDt();
                                Date date = new Date(day * 1000L);
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE yyyy-MM-dd HH-mm-ss");
                                tvDate.setText(simpleDateFormat.format(date));
                            }
                            }
                        }

                    @Override
                    public void onFailure(Call<WeatherForecasts> call, Throwable t) {

                    }
                });
            }
        });
    }



}
