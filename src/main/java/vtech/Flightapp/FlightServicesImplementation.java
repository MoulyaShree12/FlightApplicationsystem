package vtech.Flightapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServicesImplementation implements FlightServices{
	
	@Autowired
	private FlightRepository flightRepo;

	@Override
	public List<Flight> getAllFlight() {
		
		return flightRepo.findAll();
	}

	@Override
	public Flight getById(Long id) {
		
		return flightRepo.findById(id)
				.orElse(null);
	}

	@Override
	public Flight create(Flight flight) {
		
		return flightRepo.save(flight);
	}

	@Override
	public Flight update(Long id, Flight flight) {
		Flight existingflight = getById(id);
		existingflight.setFlightDeparture(flight.getFlightDeparture());
		existingflight.setFlightArrival(flight.getFlightArrival());
		existingflight.setFlightDepartDate(flight.getFlightDepartDate());
		existingflight.setFlightArrivalDate(flight.getFlightArrivalDate());
		flightRepo.save(existingflight);
		return existingflight;
	}

	@Override
	public void delete(Long id) {
		flightRepo.deleteById(id);
		
	}

	
	public List<Flight> getFlightsToday (LocalDate today) {

		return flightRepo.getFlightsToday(today);
	}


}
