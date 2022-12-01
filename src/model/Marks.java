package model;

public class Marks {
    public Marks(String name, double obtMathMarks, double obtPhysicsMarks, double obtComputerMarks) {
        this.name = name;
        this.obtMathMarks = obtMathMarks;
        this.obtPhysicsMarks = obtPhysicsMarks;
        this.obtComputerMarks = obtComputerMarks;
        this.total = total;
    }

    String name;
    double obtMathMarks;
    double obtPhysicsMarks;
    double obtComputerMarks;
    double total;


    public void setTotal(double total) {
        this.total = total;
    }

    public double getObtPhysicsMarks() {
        return obtPhysicsMarks;
    }

    public void setObtPhysicsMarks(double obtPhysicsMarks) {
        this.obtPhysicsMarks = obtPhysicsMarks;
    }

    public double getObtComputerMarks() {
        return obtComputerMarks;
    }

    public void setObtComputerMarks(double obtComputerMarks) {
        this.obtComputerMarks = obtComputerMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getObtMarks() {
        return obtMathMarks;
    }

    public void setObtMarks(double obtMarks) {
        this.obtMathMarks = obtMathMarks;
    }
    public double getTotal(){
        double sum = this.obtMathMarks+this.obtPhysicsMarks+this.obtComputerMarks;
        double total= (sum/300)*100;
        System.out.println(this.name+" obtained "+total+"%.");
        return total;
    }
}
