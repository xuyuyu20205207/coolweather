package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    //返回成功或者失败的消息
    public  String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_foreccast")
    public List<Forecast> forecastList;
}
