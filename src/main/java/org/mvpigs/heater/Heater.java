package org.mvpigs.heater;

import org.mvpigs.ambientTemperature.AmbientTemperature;

public interface Heater {
    public void engage(AmbientTemperature temp);
    public void disengage(AmbientTemperature temp);
}
