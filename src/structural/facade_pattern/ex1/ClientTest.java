package structural.facade_pattern.ex1;

public class ClientTest {
    public static void main(String[] args) {
        FurnitureFacade facade = FurnitureFacade.getInstance();
//        facade.makeTableAndChair();
        facade.makeTVAndChair();
    }
}
