package franck.thevenin.cars_lease.option;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/options")
public class OptionController {
	@Autowired
	OptionService optionService;
	
	@GetMapping("/")
	public ResponseEntity<List<Option>> getAllOptions() {
		try {
			return new ResponseEntity<>(optionService.getAll(), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Option> getOptionById(@PathVariable("id") long id) {
		Option option = optionService.getById(id);
		
		if(option != null) 
			return new ResponseEntity<>(option, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
