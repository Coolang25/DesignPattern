package creational.factory_pattern;

import creational.factory_pattern.com.phone.Android;
import creational.factory_pattern.com.phone.OS;
import creational.factory_pattern.com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getIntance("Closed");
        obj.spec();
    }
}
