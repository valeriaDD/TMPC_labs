public class HotelRoom implements RoomInterface {
    private boolean isBooked = false;

    public void book() {
        this.isBooked = true;
    }

    public boolean isRoomAvailable() {
        return !this.isBooked;
    }


}
