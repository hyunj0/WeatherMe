package com.github.hyunj0.weatherme.model;

import java.util.List;

public class Hourly {

    private String summary;
    private String icon;
    private List<HourlyForecastData> hourlyForecastData;

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

    public List<HourlyForecastData> getHourlyForecastData() {
        return hourlyForecastData;
    }

    public void setHourlyForecastData(List<HourlyForecastData> hourlyForecastData) {
        this.hourlyForecastData = hourlyForecastData;
    }
}