package creational.builder_pattern.phone.com.phone;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setProcessor(null)
                .setScreenSize(0.0)
                .setBattery(3500)
                .getPhone();

        System.out.println(p.toString());
    }
}
