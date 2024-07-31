package structural.adapter_pattern.ex1;

public class AssignmentWork {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignmentWork(String str){
        p.write(str);
    }
}
