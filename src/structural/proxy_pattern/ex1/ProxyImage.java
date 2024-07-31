package structural.proxy_pattern.ex1;

public class ProxyImage implements Image{
    private String url;
    private RealImage realImage;
    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        if (realImage == null){
            realImage = new RealImage(url);
        }else {
            System.out.println("Image already existed");
        }
        realImage.load();
    }
}
