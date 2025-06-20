package vtech.Flightapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

	 @Autowired 
	    private FlightServicesImplementation flightService;

	    @GetMapping("/all")
	    public List<Flight> getAll() {
	        return flightService.getAllFlight();
	    }

	    @GetMapping("/find/{id}")
	    public ResponseEntity<Flight> getById(@PathVariable Long id) {
	        Flight flight = flightService.getById(id);
	        if (flight == null) {
	        	
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	        }
	        return ResponseEntity.ok(flight);
	    }

	    @PostMapping("/add")
	    public ResponseEntity<Flight> create(@RequestBody Flight flight) {
	        Flight created = flightService.create(flight);
	        return new ResponseEntity("Created", HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Flight flight) 
	    {
	        Flight updated =flightService.update(id, flight);
	        return ResponseEntity.ok("updated");
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Flight> delete(@PathVariable Long id) {
	        flightService.delete(id);
	            return new ResponseEntity("Flight not found", HttpStatus.NOT_FOUND);
	    }
	    @GetMapping("/today/{today}")
		public ResponseEntity<List<Flight>> getFlightsToday(@PathVariable LocalDate today) {
			List<Flight> flight = flightService.getFlightsToday(today);
			if (flight == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			return ResponseEntity.ok(flight);
		}	    }
	
	

	
