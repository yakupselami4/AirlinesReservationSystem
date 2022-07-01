package abstracts;

import entities.Flight;
import entities.Passenger;

public interface ReservationService {
	void reservation(Flight flight, Passenger passenger);
	void reservationCancelletion(Flight flight, Passenger passenger);
}
