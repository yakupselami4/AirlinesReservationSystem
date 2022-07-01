import concretes.PassengerManager;
import concretes.ReservationManager;
import entities.Flight;
import entities.Passenger;

public class Main {
	
	public static void main(String[] args) {
		Passenger passenger1= new Passenger("Yakup Selami", "Öztürk","yakup@gmail.com","123543232");
		PassengerManager passengerManager = new PassengerManager();
		passengerManager.registarion(passenger1);
		passengerManager.login(passenger1, "yakup@gmail.com", "12354232");
		
		Flight flight1 = new Flight("Antalya uçuşu","22.07.2022");
		
		ReservationManager reservationManager = new ReservationManager();
		reservationManager.reservation(flight1, passenger1);
		reservationManager.reservationCancelletion(flight1, passenger1);
	}

}
