public class main {
    public static void main (String args[]) {
        HotelRoom hotelRoom = new HotelRoom();
        WorkingRoom workingRoom = new WorkingRoom(2);

        BookingService hotelBookingService = new BookingService(hotelRoom);
        BookingService workplaceBookingService = new BookingService(workingRoom);

        System.out.println("Book a hotel room try:");

        hotelBookingService.bookRoom();
        hotelBookingService.bookRoom();
        hotelBookingService.bookRoom();

        System.out.println("Book a workplace try:");

        workplaceBookingService.bookRoom();
        workplaceBookingService.bookRoom();
        workplaceBookingService.bookRoom();
        workplaceBookingService.bookRoom();


    }
}
