package franck.thevenin.cars_lease.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clients")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {
	@Autowired
	ClientService clientService;
	
	@GetMapping("/")
	public List<Client> getAllClients() {
		return clientService.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable("id") long id) {
		Client client = clientService.getById(id);
		
		if(client != null)
			return new ResponseEntity<>(client, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/fname/{fname}")
	public ResponseEntity<List<Client>> getClientsByFname(@PathVariable("fname") String fname) {
		List<Client> clients = clientService.getByFname(fname);
		
		return new ResponseEntity<>(clients, HttpStatus.OK);
	}
	
	@GetMapping("/lname/{lName}")
	public ResponseEntity<List<Client>> getClientsByLname(@PathVariable("lname") String lname) {
		List<Client> clients = clientService.getByLname(lname);
		
		return new ResponseEntity<>(clients, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteClientById(@PathVariable("id") long id) {
		if(clientService.deleteById(id) == true)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/")
	public ResponseEntity<Client> createNewClient(@RequestBody Client client) {
		try {
			Client newClient = clientService.save(client);
			return new ResponseEntity<>(newClient, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
}
