package org.mvpigs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mvpigs.ambientTemperature.AmbientTemperature;
import org.mvpigs.heater.HeaterImpl;
import org.mvpigs.thermometer.ThermometerImpl;


public class regulatorTest
{

    @Test
    public void furnaceTest()
    {
        Regulator regulator = new Regulator();
        ThermometerImpl t = new ThermometerImpl();
        HeaterImpl h = new HeaterImpl();
        AmbientTemperature temp = new AmbientTemperature();

        regulator.regulate(t,h,10.0,50.0, temp);
    }
}
