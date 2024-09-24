public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning airConditioning;

    public HomeInterface (Light light, TV tv, AirConditioning airConditioning) {
        this.light = light;
        this.tv = tv;
        this.airConditioning = airConditioning;
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll () {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
