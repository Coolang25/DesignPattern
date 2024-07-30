package creational.factory_pattern.ex1;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getIntance("Closed");
        obj.spec();
    }
}
