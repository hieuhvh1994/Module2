package hieu;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {

    }

    protected void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
