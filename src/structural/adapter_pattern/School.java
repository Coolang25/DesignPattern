package structural.adapter_pattern;

public class School {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();

        aw.setP(p);
        aw.writeAssignmentWork("Im bit tired");
    }
}