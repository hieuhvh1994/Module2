package View;

import Control.Hotel;
import Model.Booking;
import Model.Guest;
import Model.Room;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Guest> guests = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        ArrayList<Room> rooms = new ArrayList<>();


        Guest guest1 = new Guest("Nhung", 22, LocalDate.of(1994, 9, 12));
        Guest guest2 = new Guest("Nhung", 46, LocalDate.of(1998, 1, 31));

        Room room1 = new Room(1, "VIP", true, 1100);
        Room room2 = new Room(2, "VIP", true, 1000);
        Room room3 = new Room(3, "NORMAL", true, 900);
        Room room4 = new Room(4, "NORMAL", true, 800);
        Room room5 = new Room(5, "NORMAL", true, 700);

        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021, 9, 1), LocalDate.of(2021,9,4));
        Booking booking2 = new Booking(guest2, room2, LocalDate.of(2021, 9, 2), LocalDate.of(2021,9,6));

        guests.add(guest1);
        guests.add(guest2);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

        bookings.add(booking1);
        bookings.add(booking2);

        Hotel hotel = new Hotel("HieuDao", 6789, "Ha Noi", guests, rooms, bookings);
        hotel.getValidBooking();
        hotel.setValidBookingForRoom();

        System.out.println(hotel.getTotalIncome());

        System.out.println(hotel.getTotalIncomeRoom(room1));
        System.out.println(hotel.getTotalHiresRoom(room1));

        System.out.println(hotel.getTotalIncomeGuest(guest1));
        System.out.println(hotel.getTotalHiresGuest(guest1));

    }
}
