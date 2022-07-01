package concretes;

import abstracts.ReservationService;
import entities.Flight;
import entities.Passenger;

public class ReservationManager implements ReservationService{

	@Override
	public void reservation(Flight flight, Passenger passenger) {
		System.out.println(flight.getFlightName()+" uçuşu için "+flight.getFlightDate()+" tarihine rezervasyonunuz yapılmıştır: "+passenger.getPassengerFirstName()+" "+passenger.getPassengerLastName());
		
	}

	@Override
	public void reservationCancelletion(Flight flight, Passenger passenger) {
		System.out.println(flight.getFlightDate()+" tarihindeki "+flight.getFlightName() +"uçuşunuz iptal edilmiştir: "+passenger.getPassengerFirstName()
		+" "+passenger.getPassengerLastName());
		
	}

}
