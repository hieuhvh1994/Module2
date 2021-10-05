package Model;

import static java.time.temporal.ChronoUnit.DAYS;

public class Room {
    private int number;
    private String type;
    private boolean status;
    private int price;
    private Booking booking;

    public Room() {
    }

    public Room(int number, String type, boolean status, int price) {
        this.number = number;
        this.type = type;
        this.status = status;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", booking=" + booking +
                '}';
    }
}
