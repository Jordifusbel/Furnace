package org.mvpigs;


import org.mvpigs.ambientTemperature.AmbientTemperature;
import org.mvpigs.heater.Heater;
import org.mvpigs.regulatorDisplayCodes.RegulatorDisplayCodes;
import org.mvpigs.thermometer.Thermometer;

public class Regulator {

        public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature){
            RegulatorDisplayCodes code;
            while(t.read(temperature) < maxTemp){
                code = RegulatorDisplayCodes.HEATING;
                h.engage(temperature);
                message(code, temperature);
            }
            while (t.read(temperature) > minTemp){
                code = RegulatorDisplayCodes.WAITING;
                h.disengage(temperature);
                message(code, temperature);
            }
        }

        private void message(RegulatorDisplayCodes code, AmbientTemperature temperature){

        }

    }

