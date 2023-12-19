package models;
public class Yamaha {
    int bookings;
    public Yamaha(int bookings) {
        this.bookings = bookings;
    }
    public int getBookings() {
        return this.bookings;
    }
    public int setBookings(String bikeName) {
        System.out.println("Bike Booked: " + bikeName);
        bookings++;
        return bookings;
    }

}
