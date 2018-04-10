package com.project.mcl.server;

/**
 * Created by myks7 on 2018-03-30.
 */

public class Data {
    private String time="";
    private String temperature = "";
    private String pressure = "";
    private String humidity = "";

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    String getGETString() {
        String str = "temperature=" + temperature + "&pressure=" + pressure + "&humidity=" + humidity;
        return str;
    }

}
