package org.mvpigs.thermometer;

import org.mvpigs.ambientTemperature.AmbientTemperature;

public interface Thermometer {
    public Double read(AmbientTemperature temp);
}
