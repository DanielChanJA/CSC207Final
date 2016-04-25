package com.danielchan.Dec2012UTMQ5;

import java.util.Observable;

/**
 * Created by chanj on 4/25/2016.
 */
public class WeatherData extends Observable {

    private float m_temperature;
    private float m_humidity;
    private float m_pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {

        setChanged();
        notifyObservers();
        clearChanged();
    }

    public void setMeasurements(float temperature, float humidity,
        float pressure) {

        this.m_temperature = temperature;
        this.m_humidity = humidity;
        this.m_pressure = pressure;

        measurementsChanged();

    }

    public float getM_temperature() {
        return m_temperature;
    }

    public float getM_humidity() {
        return m_humidity;
    }

    public float getM_pressure() {
        return m_pressure;
    }
}
