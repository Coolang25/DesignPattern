package structural.facade_pattern.ex1;

public class Chair implements Furniture {
    @Override
    public void make() {
        System.out.println("make a chair");
    }
}
