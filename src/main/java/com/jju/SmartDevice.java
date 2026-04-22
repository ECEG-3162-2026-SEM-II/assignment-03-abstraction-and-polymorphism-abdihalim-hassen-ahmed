// src/SmartDevice.java
public abstract class SmartDevice {
    private String name; // encapsulated

    // Constructor
    public SmartDevice(String name) {
        this.name = name;
    }

    // Getter for subclasses
    public String getName() {
        return name;
    }

    // Abstract method (no body)
    public abstract void activate();
}