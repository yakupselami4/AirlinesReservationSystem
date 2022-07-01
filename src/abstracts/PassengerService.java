package abstracts;

import entities.Passenger;

public interface PassengerService {
	
	void registarion(Passenger passenger);
	
	void login(Passenger passenger,String id, String password);
	
	

}
