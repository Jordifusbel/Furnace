package org.mvpigs.thermometer;

import org.mvpigs.ambientTemperature.AmbientTemperature;

public class ThermometerImpl implements Thermometer {


    public Double read(AmbientTemperature temp){
        return temp.getAmbientTemperature();
    }
}
