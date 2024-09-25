public class Main {
    public static void main(String[] args) {
        PowerOutlet laptopOutlet = new LaptopAdapter(new Laptop());
        laptopOutlet.plugIn();

        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(new Refrigerator());
        fridgeOutlet.plugIn();

        PowerOutlet phoneOutlet = new SmartphoneAdapter(new SmartphoneCharger());
        phoneOutlet.plugIn();
    }
}
