package behavioral.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber s1 = new Subscriber("QT");
        Subscriber s2 = new Subscriber("TV");
        Subscriber s3 = new Subscriber("LD");
        Subscriber s4 = new Subscriber("BC");
        Subscriber s5 = new Subscriber("KV");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);

        channel.upload("Learn java");



    }
}
