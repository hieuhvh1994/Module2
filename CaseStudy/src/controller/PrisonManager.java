package controller;

import model.Camp;
import model.Warden;

import java.io.Serializable;
import java.util.List;

public class
PrisonManager implements Serializable {
    private String name;
    private List<Camp> camps;
    private Warden wardenLeader;

    public PrisonManager() {
    }

    public PrisonManager(String name, List<Camp> camps, Warden wardenLeader) {
        this.name = name;
        this.camps = camps;
        this.wardenLeader = wardenLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Camp> getCamps() {
        return camps;
    }

    public void setCamps(List<Camp> camps) {
        this.camps = camps;
    }

    public Warden getWardenLeader() {
        return wardenLeader;
    }

    public void setWardenLeader(Warden wardenLeader) {
        this.wardenLeader = wardenLeader;
    }

    @Override
    public String toString() {
        return "Prison{" +
                "name='" + name + '\'' +
                ", camps=" + camps +
                ", wardenLeader=" + wardenLeader +
                '}';
    }
}
