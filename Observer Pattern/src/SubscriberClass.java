public class SubscriberClass implements Subscriber {
    private String name;

    public SubscriberClass(String name) {
        this.name = name;
    }

    @Override
    public void update(String Content) {
        System.out.println(name + " received news update: " + Content);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
