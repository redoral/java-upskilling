package com.revature;

import com.revature.Interfaces.Battery;
import com.revature.Interfaces.Screen;
import com.revature.Interfaces.Speakers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone implements Battery, Screen, Speakers {

    // Vars
    private boolean isCharging;
    private boolean screenIsOn;
    private int batteryPercentage;
    private int screenBrightness;
    private int volume;

    // Interface methods
    // Battery interface methods
    public void startCharge(){
        setCharging(true);

        while (batteryPercentage < 100){
            setBatteryPercentage(batteryPercentage += 5);
            System.out.println("Charging - " + getBatteryPercentage() + "%");
        }

        stopCharge();
    }

    public void stopCharge(){
        setCharging(false);
        System.out.println("Stopped charging.");
    }

    // Screen interface methods
    public void turnOnScreen(){
        setScreenIsOn(true);
        System.out.println("Turned screen on.");
    }

    public void turnOffScreen(){
        setScreenIsOn(false);
        System.out.println("Turned screen off.");
    }

    public void lowerBrightness(int amount){
        setScreenBrightness(screenBrightness -= amount);
        System.out.println("Set screen brightness to: " + getScreenBrightness() + "%");
    }

    public void increaseBrightness(int amount){
        setScreenBrightness(screenBrightness += amount);
        System.out.println("Set screen brightness to: " + getScreenBrightness() + "%");
    }


    // Speakers interface methods
    public void lowerVolume(int amount){
        setVolume(volume -= amount);
        System.out.println("Set volume to: " + getVolume() + "%");

    }

    public void increaseVolume(int amount){
        setVolume(volume += amount);
        System.out.println("Set volume to: " + getVolume() + "%");
    }

    // Getters and setters
    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }

    public boolean isScreenIsOn() {
        return screenIsOn;
    }

    public void setScreenIsOn(boolean screenIsOn) {
        this.screenIsOn = screenIsOn;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        if (batteryPercentage > 100){
            batteryPercentage = 100;
        }

        this.batteryPercentage = batteryPercentage;
    }

    public int getScreenBrightness() {
        return screenBrightness;
    }

    public void setScreenBrightness(int screenBrightness) {
        if (screenBrightness > 100){
            screenBrightness = 100;
        }

        if (screenBrightness < 0){
            screenBrightness = 0;
        }

        this.screenBrightness = screenBrightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100){
            volume = 100;
        }

        if (volume < 0){
            volume = 0;
        }

        this.volume = volume;
    }
}
