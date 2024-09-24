public class homeApp {
    public static void main(String args[]) {
        Light light = new Light();
        TV tv = new TV();
        AirConditioning airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(light, tv, airConditioning);

        homeInterface.turnOnAll();
        homeInterface.turnOffAll();
    }
}
