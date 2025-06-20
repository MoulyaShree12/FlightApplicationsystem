package vtech.Flightapp;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{
	
	@Query("SELECT f FROM Flight f WHERE :today BETWEEN f.flightDepartDate AND f.flightArrivalDate")
	List<Flight> getFlightsToday(@Param("today") LocalDate   today);
	
	
		
}

