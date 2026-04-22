// src/Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // List of parent type
        ArrayList<SmartDevice> devices = new ArrayList<>();

        // Add different device types
        devices.add(new SmartLight("Living Room Light"));
        devices.add(new SmartThermostat("Hallway Thermostat"));

        // Polymorphic loop
        for (SmartDevice device : devices) {
            device.activate(); // calls correct method automatically
        }
    }
}