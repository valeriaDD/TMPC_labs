public class HotelRoom implements RoomInterface {
    private boolean isBooked = false;

    public void book() {
        this.isBooked = true;
        this.notifySuccessfulBooking();
    }

    public boolean isRoomAvailable() {
        return !this.isBooked;
    }

    private void notifySuccessfulBooking() {
        System.out.println("You have successfully booked this room");
    }
}
