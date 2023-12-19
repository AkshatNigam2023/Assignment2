package models;

import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

@ClassDocumentation
public class Mercedes{
    int bookings;
    public Mercedes(int bookings) {
        this.bookings = bookings;
    }
    @annotations.MethodDocumentation
    public int getBookings() {
        return this.bookings;
    }

    @annotations.MethodDocumentation(documentation = "Method for booking car.")
    public int setbookings(String carName) {
        System.out.println("Car Booked: " + carName);
        bookings++;
        return bookings;
    }
    @MethodDocumentation
    public void valueMember(int totalCars) {
        if(totalCars >= 2)
            System.out.println("Congrats! For becoming Value Member.");
    }
}