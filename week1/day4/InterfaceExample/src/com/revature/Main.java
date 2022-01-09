package com.revature;

public class Main {

    public static void main(String[] args){
        // Create new instance of Phone which inherits three interfaces
        Phone pixel = new Phone();
        pixel.setScreenBrightness(50);
        pixel.setBatteryPercentage(50);
        pixel.setVolume(50);

        // Calls all referenced methods from the three interfaces from the Phone instance
        pixel.startCharge();
        pixel.turnOnScreen();
        pixel.turnOffScreen();
        pixel.increaseBrightness(10);
        pixel.lowerBrightness(5);
        pixel.increaseVolume(10);
        pixel.lowerVolume(5);

        // Displays phone status
        System.out.println("\n=================" + "\nPhone Status" + "\n=================");
        System.out.println("Brightness: " + pixel.getScreenBrightness() + "%");
        System.out.println("Volume: " + pixel.getVolume() + "%");
        System.out.println("Battery: " + pixel.getBatteryPercentage() + "%");
        System.out.println("Charging: " + pixel.isCharging());
        System.out.println("Screen On: " + pixel.isScreenIsOn());
    }
}
