package vtech.Flightapp;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long flightId;
	
	private String flightDeparture;
	private String flightArrival;
	private LocalDate flightDepartDate;
	private LocalDate flightArrivalDate;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFlightDeparture() {
		return flightDeparture;
	}
	public void setFlightDeparture(String flightDeparture) {
		this.flightDeparture = flightDeparture;
	}
	public String getFlightArrival() {
		return flightArrival;
	}
	public void setFlightArrival(String flightArrival) {
		this.flightArrival = flightArrival;
	}
	public LocalDate getFlightDepartDate() {
		return flightDepartDate;
	}
	public void setFlightDepartDate(LocalDate flightDepartDate) {
		this.flightDepartDate = flightDepartDate;
	}
	public LocalDate getFlightArrivalDate() {
		return flightArrivalDate;
	}
	public void setFlightArrivalDate(LocalDate flightArrivalDate) {
		this.flightArrivalDate = flightArrivalDate;
	}
	
	
	
}
