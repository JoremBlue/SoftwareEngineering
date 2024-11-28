public class Main {
    public static void main(String []args) {
        NewsAgency agency = new NewsAgency();

        Subscriber sub1 = new SubscriberClass("Anthony");
        Subscriber sub2 = new SubscriberClass("Kenneth");
        Subscriber sub3 = new SubscriberClass("Ian");

        agency.subscribe(sub1);
        agency.subscribe(sub2);
        agency.subscribe(sub3);

        agency.publishNews("The bitcoin keeps going up!");
        agency.unsubscribe(sub2);
        agency.publishNews("Volcanic eruption erupts at Mount fuji, forcing evacuations!");
    }
}
