package model;

public class Classes {
    int standard;
    String name;

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes(int standard, String name) {
        this.standard = standard;
        this.name = name;
    }
}
