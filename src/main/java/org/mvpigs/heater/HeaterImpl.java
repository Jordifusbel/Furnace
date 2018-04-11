package org.mvpigs.heater;

import org.mvpigs.ambientTemperature.AmbientTemperature;

public class HeaterImpl implements Heater {
    public void engage(AmbientTemperature temp){
        temp.setAmbientTemperature(temp.getAmbientTemperature() + 1.0);
    }
    public void disengage (AmbientTemperature temp){
        temp.setAmbientTemperature(temp.getAmbientTemperature() - 1.0);
    }


}
