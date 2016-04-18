package com.github.hyunj0.weatherme.model;

import java.util.List;

public class Minutely {

    private String summary;
    private String icon;
    private List<MinutelyForecastData> minutelyForecastData;

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

    public List<MinutelyForecastData> getMinutelyForecastData() {
        return minutelyForecastData;
    }

    public void setMinutelyForecastData(List<MinutelyForecastData> minutelyForecastData) {
        this.minutelyForecastData = minutelyForecastData;
    }
}