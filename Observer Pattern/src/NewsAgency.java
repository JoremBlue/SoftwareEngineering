import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println(subscriber.getName() + " has subscrubed.");
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has unsubscribed");
    }

    public void publishNews(String Content) {
        System.out.println("Breaking News: " + Content);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(Content);
        }
    }
}

