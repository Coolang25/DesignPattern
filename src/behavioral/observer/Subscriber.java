package behavioral.observer;

public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println(name + " Video Uploaded");
    }

    @Override
    public void subscribeChannel(Channel ch) {
        channel = ch;
    }
}
