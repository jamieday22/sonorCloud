package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

public class Kettle {

///////////////////////////Attributes/////////////////////////////////
    private int currentVolume;
    private int maxVolume;
    private String colour;
    private int temperature;
    private LocalDateTime timeOfTemperature;

////////////////////////////////constructors/////////////////////////////

public Kettle(){
        currentVolume = 0;
        maxVolume = 1700;
        colour = "white";
        temperature = 16;
        timeOfTemperature = LocalDateTime.now();
}




////////////////////////////////////////Methods///////////////////////////

public void boilKettle(){
        temperature = 100;
        timeOfTemperature = LocalDateTime.now();

}
public int getTemperature(){
       return temperature = rateOfCooling();
}
public int rateOfCooling(){
        Duration numberOfSeconds = Duration.between(LocalDateTime.now(), timeOfTemperature);
        long getSeconds = numberOfSeconds.getSeconds();
        int currentTemp = (int)(100 - (getSeconds*10));
        if (currentTemp<16){
            currentTemp = 16;
        }
        timeOfTemperature = LocalDateTime.now();
        return currentTemp;

}


}
