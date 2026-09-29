public class HomeInterface {
    private final HomeService light;
    private final HomeService tv;
    private final HomeService airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("\n--- Turning On All Services ---");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("\n--- Turning Off All Services ---");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}