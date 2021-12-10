package ProyectosOB.EjercicioSesion4;

public class SmartDevice {

    protected String brand;
    protected String model;
    protected int price;
    protected String OS;
    protected int batteryOnmah;
    protected boolean weareable;
    protected boolean waterproof;
    protected boolean fastCharge;
    protected int weightOnGrams;
    protected boolean includesCharger;
    protected String chargingPort;

    public SmartDevice(){}

    public SmartDevice(String brand, String model, int price, String OS, int batteryOnmah, boolean weareable, boolean waterproof,
                       boolean fastCharge, int weightOnGrams, boolean includesCharger, String chargingPort) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.OS = OS;
        this.batteryOnmah = batteryOnmah;
        this.weareable = weareable;
        this.waterproof = waterproof;
        this.fastCharge = fastCharge;
        this.weightOnGrams = weightOnGrams;
        this.includesCharger = includesCharger;
        this.chargingPort = chargingPort;
    }

    public void discount(int quantity) {

        this.price -= quantity;

    }
}
