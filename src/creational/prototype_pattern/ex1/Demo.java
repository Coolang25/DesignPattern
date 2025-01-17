package creational.prototype_pattern.ex1;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("QT");
        bs.loadData();
        System.out.println(bs);

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("A1");
        System.out.println(bs1);
    }
}
