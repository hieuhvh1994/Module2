package Control;

import Model.Booking;
import Model.Guest;
import Model.Room;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private int phone;
    private String address;
    ArrayList<Guest> guests;
    ArrayList<Room> rooms;
    ArrayList<Booking> bookings;

    public Hotel() {
    }

    public Hotel(String name, int phone, String address, ArrayList<Guest> guests, ArrayList<Room> rooms, ArrayList<Booking> bookings) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.guests = guests;
        this.rooms = rooms;
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public long getTotalIncome() {
        long totalIncome = 0;
        for (int i = 0; i<bookings.size(); i++) {
            totalIncome += bookings.get(i).getBookingIncome();

        }

        return totalIncome;
    }

    public void getValidBooking() {
        ArrayList<Booking> validBookings = new ArrayList<>();
        for (int i = 0; i<bookings.size(); i++) {
            if (checkValidBooking(bookings.get(i)) == true) {
                validBookings.add(bookings.get(i));
            }
        }

        setBookings(validBookings);

    }

    public long getTotalIncomeRoom(Room room) {
        long incomeRoom = 0;
        for (int i = 0; i<bookings.size(); i++) {
            if (bookings.get(i).getRoom() == room) {
                incomeRoom += bookings.get(i).getBookingIncome();
            }
        }

        return incomeRoom;
    }

    public long getTotalHiresRoom(Room room) {
        long hiredTimesRoom = 0;
        for (int i = 0; i<bookings.size(); i++) {
            if (bookings.get(i).getRoom() == room) {
                hiredTimesRoom += 1;
            }
        }

        return hiredTimesRoom;
    }

    public long getTotalIncomeGuest(Guest guest) {
        long incomeGuest = 0;
        for (int i = 0; i<bookings.size(); i++) {
            if (bookings.get(i).getGuest() == guest) {
                incomeGuest += bookings.get(i).getBookingIncome();
            }
        }

        return incomeGuest;
    }

    public long getTotalHiresGuest(Guest guest) {
        long hiredTimesGuest = 0;
        for (int i = 0; i<bookings.size(); i++) {
            if (bookings.get(i).getGuest() == guest) {
                hiredTimesGuest += 1;
            }
        }

        return hiredTimesGuest;
    }

    public void setValidBookingForRoom() {
        ArrayList<Booking> booked = new ArrayList<>();
        for (int i=0; i<bookings.size(); i++) {
            if (booked.contains(bookings.get(i)) == false) {
                bookings.get(i).getRoom().setBooking(bookings.get(i));
                booked.add(bookings.get(i));
            }
        }
    }


    public boolean checkValidBooking(Booking booking){
        boolean canBooked = false;
        if (booking.getRoom().isStatus() == false && booking.getCheckin().isAfter(booking.getRoom().getBooking().getCheckout())) {
            canBooked = true;
        } else if (booking.getRoom().isStatus() == true) {
            canBooked = true;
        }

        return canBooked;
    }





    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", guests=" + guests +
                ", rooms=" + rooms +
                ", bookings=" + bookings +
                '}';
    }
}
