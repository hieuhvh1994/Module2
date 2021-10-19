package Model;

import java.time.LocalDate;


public class Prisoner {
    private String name;
    private String address;
    private int id;
    private LocalDate dob;
    private String crimeLevel;
    private int yearsInPrison;
    private LocalDate dateOfExecution;
    private LocalDate dateOfExpiration;

    public Prisoner(String name, String address, int id, LocalDate dob, String crimeLevel, int yearsInPrison, LocalDate dateOfExecution) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.dob = dob;
        this.crimeLevel = crimeLevel;
        this.yearsInPrison = yearsInPrison;
        this.dateOfExecution = dateOfExecution;
        this.dateOfExpiration = getDateOfExecution().plusYears(getYearsInPrison());
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCrimeLevel() {
        return crimeLevel;
    }

    public void setCrimeLevel(String crimeLevel) {
        this.crimeLevel = crimeLevel;
    }

    public int getYearsInPrison() {
        return yearsInPrison;
    }

    public void setYearsInPrison(int yearsInPrison) {
        this.yearsInPrison = yearsInPrison;
    }

    public LocalDate getDateOfExecution() {
        return dateOfExecution;
    }

    public void setDateOfExecution(LocalDate dateOfExecution) {
        this.dateOfExecution = dateOfExecution;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(LocalDate dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", crimeLevel='" + crimeLevel + '\'' +
                ", yearsInPrison=" + yearsInPrison +
                ", dateOfExecution=" + dateOfExecution +
                ", dateOfExpiration=" + dateOfExpiration +
                '}';
    }
}
