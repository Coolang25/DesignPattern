package creational.factory_pattern.ex2;

public class ClientTest {
    public static void main(String[] args) {
        Candy candy = CandyFactory.getCandy(CandyType.MINTY_CANDY);
        System.out.println(candy.getCandyName());
    }
}
