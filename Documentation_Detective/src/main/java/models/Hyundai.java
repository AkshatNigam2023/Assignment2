package models;

import annotations.ClassDocumentation;
import annotations.MethodDocumentation;
@ClassDocumentation
public class Hyundai {
    int bookings;
    public Hyundai(int bookings) {
        this.bookings = bookings;
    }
    @MethodDocumentation
    public int getBookings() {
        return this.bookings;
    }


    @MethodDocumentation
    public int setBookings(String carName) {
        System.out.println("Car Booked: " + carName);
        bookings++;
        return bookings;
    }

}
