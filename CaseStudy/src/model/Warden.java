package model;

import authentication.Account;

import java.io.Serializable;
import java.time.LocalDate;

public class Warden implements Serializable {
    private String name;
    private String address;
    private LocalDate dob;
    private int id;
    private LocalDate workingStartDate;
    private String position;
    private Account account;

    public Warden(String name, String address, LocalDate dob, int id, LocalDate workingStartDate, String position, Account account) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.id = id;
        this.workingStartDate = workingStartDate;
        this.position = position;
        this.account = account;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Warden: " + "\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "DOB: " + dob + "\n" +
                "ID: " + id + "\n" +
                "Working Start Date: " + workingStartDate + "\n" +
                "Position: " + position + '\n';

    }
}
