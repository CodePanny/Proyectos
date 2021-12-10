package ProyectosOB.EjercicioSesion4;

import ProyectosOB.EjercicioSesion4.SmartDevice;
import ProyectosOB.EjercicioSesion4.inheritance.SmartPhone;
import ProyectosOB.EjercicioSesion4.inheritance.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone();

        iPhone.brand = "Apple";
        iPhone.model = "iPhone 13 PRO MAX";
        iPhone.price = 1350;
        iPhone.OS = "iOS";
        iPhone.batteryOnmah = 4600;
        iPhone.weareable = false;
        iPhone.waterproof = true;
        iPhone.fastCharge = true;
        iPhone.weightOnGrams = 456;
        iPhone.includesCharger = false;
        iPhone.chargingPort = "Lighting";
        iPhone.suports5g = true;
        iPhone.suportsaccessPoint = true;
        iPhone.accelerometer = true;
        iPhone.includesCase = false;
        iPhone.simType = "Nano SIM";
        iPhone.numberOfCameras = 4;

        SmartPhone samsungS21 = new SmartPhone();

        samsungS21.brand = "Samsung";
        samsungS21.model = "S 21";
        samsungS21.price = 980;
        samsungS21.OS = "Android";
        samsungS21.batteryOnmah = 4200;
        samsungS21.weareable = false;
        samsungS21.waterproof = false;
        samsungS21.fastCharge = true;
        samsungS21.weightOnGrams = 410;
        samsungS21.includesCharger = false;
        samsungS21.chargingPort = "USB C";
        samsungS21.suports5g = true;
        samsungS21.suportsaccessPoint = true;
        samsungS21.accelerometer = true;
        samsungS21.includesCase = true;
        samsungS21.simType = "Nano SIM";
        samsungS21.numberOfCameras = 3;

        SmartWatch appleWatch = new SmartWatch();

        appleWatch.brand = "Apple";
        appleWatch.model = "Watch Series 7";
        appleWatch.price = 420;
        appleWatch.OS = "Apple wear";
        appleWatch.batteryOnmah = 600;
        appleWatch.weareable = true;
        appleWatch.waterproof = true;
        appleWatch.fastCharge = true;
        appleWatch.weightOnGrams = 180;
        appleWatch.includesCharger = false;
        appleWatch.chargingPort = "Wireless";
        appleWatch.osSupport = "iOs & Android";
        appleWatch.impactProof = true;
        appleWatch.alwaysOnDisplay = true;
        appleWatch.screenType = "Retina";

        System.out.println("Brand is: " + appleWatch.brand);
        System.out.println("Model is: " + appleWatch.model);
        System.out.println("Price starts at: " +appleWatch.price);
        System.out.println("It works with " + appleWatch.OS + " system");
        System.out.println("Has a " + appleWatch.batteryOnmah + " mah battery");
        System.out.println("Wearable: " + appleWatch.weareable);
        System.out.println("Waterproof: " + appleWatch.waterproof);
        System.out.println("Fastcharge: " + appleWatch.fastCharge);
        System.out.println("It weights " + appleWatch.weightOnGrams + " grams");
        System.out.println("Charger included: " + appleWatch.includesCharger);
        System.out.println("It uses " + appleWatch.chargingPort + " for charging");
        System.out.println("It works with " + appleWatch.osSupport);
        System.out.println(appleWatch.impactProof);
        System.out.println(appleWatch.alwaysOnDisplay);
        System.out.println("Has a " + appleWatch.screenType + " display");
    }






}
