package models;

public class Kia {
    int bookings;
    public Kia(int bookings) {
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
