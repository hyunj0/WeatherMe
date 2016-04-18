package com.github.hyunj0.weatherme.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPoint {

    @SerializedName("time")
    @Expose
    private long time;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("icon")
    @Expose
    private String icon;

    @SerializedName("sunriseTime")
    @Expose
    private long sunriseTime;

    @SerializedName("sunsetTime")
    @Expose
    private long sunsetTime;

    @SerializedName("moonPhase")
    @Expose
    private double moonPhase;

    @SerializedName("nearestStormDistance")
    @Expose
    private double nearestStormDistance;

    @SerializedName("nearestStormBearing")
    @Expose
    private double nearestStormBearing;

    @SerializedName("precipIntensity")
    @Expose
    private double precipIntensity;

    @SerializedName("precipProbability")
    @Expose
    private double precipProbability;

    @SerializedName("precipType")
    @Expose
    private String precipType;

    @SerializedName("precipAccumulation")
    @Expose
    private double precipAccumulation;

    @SerializedName("temperature")
    @Expose
    private double temperature;

    @SerializedName("temperatureMin")
    @Expose
    private double temperatureMin;

    @SerializedName("temperatureMinTime")
    @Expose
    private long temperatureMinTime;

    @SerializedName("temperatureMax")
    @Expose
    private double temperatureMax;

    @SerializedName("temperatureMaxTime")
    @Expose
    private long temperatureMaxTime;

    @SerializedName("apparentTemperatureMin")
    @Expose
    private double apparentTemperatureMin;

    @SerializedName("apparentTemperatureMinTime")
    @Expose
    private long apparentTemperatureMinTime;

    @SerializedName("apparentTemperatureMax")
    @Expose
    private double apparentTempertureMax;

    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    private long apparentTemperatureMaxTime;

    @SerializedName("dewPoint")
    @Expose
    private double dewPoint;

    @SerializedName("windSpeed")
    @Expose
    private double windSpeed;

    @SerializedName("windBearing")
    @Expose
    private double windBearing;

    @SerializedName("cloudCover")
    @Expose
    private double cloudCover;

    @SerializedName("humidity")
    @Expose
    private double humidity;

    @SerializedName("pressure")
    @Expose
    private double pressure;

    @SerializedName("visibility")
    @Expose
    private double visibility;

    @SerializedName("ozone")
    @Expose
    private double ozone;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

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

    public long getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(long sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public long getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(long sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public double getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(double nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public double getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(double nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public double getPrecipAccumulation() {
        return precipAccumulation;
    }

    public void setPrecipAccumulation(double precipAccumulation) {
        this.precipAccumulation = precipAccumulation;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public long getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(long temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public long getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime(long temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public long getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(long apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTempertureMax() {
        return apparentTempertureMax;
    }

    public void setApparentTempertureMax(double apparentTempertureMax) {
        this.apparentTempertureMax = apparentTempertureMax;
    }

    public long getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(long apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }
}
