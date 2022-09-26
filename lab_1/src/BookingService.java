public class BookingService {
    private RoomInterface room;

    BookingService(RoomInterface room) {
        this.room = room;
    }

    public void bookRoom() {
        if(this.room.isRoomAvailable()) {
            this.room.book();
            this.notifySuccessfulBooking();
        } else {
            this.notifyRoomIsNotAvailable();
        }
    }

    private void notifyRoomIsNotAvailable() {
        System.out.println("This room is already booked");
    }

    private void notifySuccessfulBooking() {
        System.out.println("You have successfully booked this room");
    }
}
