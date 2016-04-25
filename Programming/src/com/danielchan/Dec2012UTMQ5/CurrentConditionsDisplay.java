package com.danielchan.Dec2012UTMQ5;

import org.omg.CORBA.Current;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chanj on 4/25/2016.
 */
public class CurrentConditionsDisplay implements Observer {

    Observable m_observable;
    private float m_temperature;
    private float m_humidity;

    public CurrentConditionsDisplay(Observable observable) {
        m_observable = observable;
        observable.addObserver(this);

    }

    public void display() {
        System.out.println(
            "Current conditions: " + m_temperature + "F " + "degrees and "
                + m_humidity + "% humidity");
    }

    @Override public void update(Observable o, Object arg) {

        m_humidity = ((WeatherData) o).getM_humidity();
        m_temperature = ((WeatherData) o).getM_temperature();

        display();

    }
}
