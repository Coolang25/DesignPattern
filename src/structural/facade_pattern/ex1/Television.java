package structural.facade_pattern.ex1;

public class Television implements Furniture{
    @Override
    public void make() {
        System.out.println("make a TV");
    }
}
