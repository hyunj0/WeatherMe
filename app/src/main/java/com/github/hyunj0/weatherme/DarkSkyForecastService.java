package com.github.hyunj0.weatherme;

import com.github.hyunj0.weatherme.model.Forecast;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class DarkSkyForecastService {

    private static final String BASE_URL = "https://api.forecast.io/forecast/";
    private static final String API_KEY = BuildConfig.API_KEY;
    private static final String API_URL = BASE_URL + API_KEY + "/";

    public static DarkSkyForecast getDarkSkyForecast() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(DarkSkyForecast.class);
    }

    public interface DarkSkyForecast {
        @GET("{latitude},{longitude}")
        Call<Forecast> getForecast(@Path("latitude") double latitude, @Path("longitude") double longitude);
    }

}