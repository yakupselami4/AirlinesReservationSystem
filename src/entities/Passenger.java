package entities;

public class Passenger {
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPassword;
	
	
	public Passenger() {
		
	}


	public Passenger(String passengerFirstName, String passengerLastName, String passengerEmail,
			String passengerPassword) {
		super();
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
		this.passengerEmail = passengerEmail;
		this.passengerPassword = passengerPassword;
	}


	public String getPassengerFirstName() {
		return passengerFirstName;
	}


	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}


	public String getPassengerLastName() {
		return passengerLastName;
	}


	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}


	public String getPassengerEmail() {
		return passengerEmail;
	}


	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}


	public String getPassengerPassword() {
		return passengerPassword;
	}


	public void setPassengerPassword(String passengerPassword) {
		this.passengerPassword = passengerPassword;
	}
	
}
