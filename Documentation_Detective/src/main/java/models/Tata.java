package models;

import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

@ClassDocumentation
public class Tata {
    int bookings;

    public Tata(int bookings) {
        this.bookings = bookings;
    }

    @annotations.MethodDocumentation
    public int getBookings() {
        return this.bookings;
    }
    @annotations.MethodDocumentation
    public int setBookings(String carName) {
        System.out.println("Car booked: " + carName);
        bookings++;
        return bookings;
    }
}
