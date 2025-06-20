package vtech.Flightapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.query.Param;

public interface FlightServices {

	List<Flight> getAllFlight();
	Flight getById(Long id);
	Flight create(Flight flight);
	Flight update(Long id, Flight flight);
     void delete(Long id);
    
}