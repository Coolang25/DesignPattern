package structural.composite_pattern;

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(400, "hdd");
        Component mouse = new Leaf(400, "mouse");
        Component monitor = new Leaf(400, "monitor");
        Component ram = new Leaf(400, "ram");
        Component cpu = new Leaf(400, "cpu");

        Composite ph = new Composite("Perl");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
