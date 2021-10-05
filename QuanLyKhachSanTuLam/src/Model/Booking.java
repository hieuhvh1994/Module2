package Model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Booking {
    private Guest guest;
    private Room room;
    private LocalDate checkin;
    private LocalDate checkout;

    public Booking() {
    }

    public Booking(Guest guest, Room room, LocalDate checkin, LocalDate checkout) {
        this.guest = guest;
        this.room = room;
        this.checkin = checkin;
        this.checkout = checkout;


    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }



    public long getBookingIncome() {
        return DAYS.between(checkin, checkout) * room.getPrice();

    }


    @Override
    public String toString() {
        return "Booking{" +
                "guest=" + guest +
                ", room=" + room +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}
