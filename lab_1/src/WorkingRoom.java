public class WorkingRoom implements RoomInterface {
    private final int availablePlaces;
    private int bookedPlaces = 0;

    WorkingRoom(int availablePlaces) {
        this.availablePlaces = availablePlaces;
    }

    public void book() {
        this.bookedPlaces++;
        this.notifySuccessfulBooking();
    }

    public boolean isRoomAvailable() {
        return bookedPlaces + 1 <= availablePlaces;
    }

    private void notifySuccessfulBooking() {
        System.out.println("You have successfully booked this room");
    }
}
