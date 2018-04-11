package org.mvpigs.heater;

public interface Heater {
    public void engage(ambientTemperature);
    public void disengage(ambientTemperature);
}
