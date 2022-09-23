public class BookingService {
    private RoomInterface room;

    BookingService(RoomInterface room) {
        this.room = room;
    }

    public void bookRoom() {
        if(this.room.isRoomAvailable()) {
            this.room.book();
        } else {
            this.notifyRoomIsNotAvailable();
        }
    }

    private void notifyRoomIsNotAvailable() {
        System.out.println("This room is already booked");

    }

}
