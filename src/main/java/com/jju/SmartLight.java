// src/SmartLight.java
public class SmartLight extends SmartDevice {

    public SmartLight(String name) {
        super(name); // pass to parent constructor
    }

    @Override
    public void activate() {
        System.out.println(getName() + " is now ON at 100% brightness.");
    }
}