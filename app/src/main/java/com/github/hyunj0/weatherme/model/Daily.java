package com.github.hyunj0.weatherme.model;

import java.util.List;

public class Daily {

    private String summary;
    private String icon;
    private List<DailyForecastData> dailyForecastData;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<DailyForecastData> getDailyForecastData() {
        return dailyForecastData;
    }

    public void setDailyForecastData(List<DailyForecastData> dailyForecastData) {
        this.dailyForecastData = dailyForecastData;
    }
}