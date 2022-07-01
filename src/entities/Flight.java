package entities;

public class Flight {
	private String flightName;
	private String flightDate;
	
	
	public Flight() {
		
	}
	
	
	public Flight(String flightName, String flightDate) {
		super();
		this.flightName = flightName;
		this.flightDate = flightDate;
	}


	public String getFlightName() {
		return flightName;
	}


	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}


	public String getFlightDate() {
		return flightDate;
	}


	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}


	
}
