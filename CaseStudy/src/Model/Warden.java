package Model;

import java.time.LocalDate;

public class Warden {
    private String name;
    private String address;
    private LocalDate dob;
    private int id;
    private LocalDate workingStartDate;
    private String position;

    public Warden(String name, String address, LocalDate dob, int id, LocalDate workingStartDate, String position) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.id = id;
        this.workingStartDate = workingStartDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getWorkingStartDate() {
        return workingStartDate;
    }

    public void setWorkingStartDate(LocalDate workingStartDate) {
        this.workingStartDate = workingStartDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Warden{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", id=" + id +
                ", workingStartDate=" + workingStartDate +
                ", position='" + position + '\'' +
                '}';
    }
}
