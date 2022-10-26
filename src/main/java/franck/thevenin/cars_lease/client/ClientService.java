package franck.thevenin.cars_lease.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	public Client save(Client client) {
		return clientRepository.save(client);
	}
	
	public List<Client> getAll() {
		return clientRepository.findAll();
	}
	
	public Client getById(long id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	public List<Client> getByFname(String fname) {
		return clientRepository.findByFname(fname);
	}
	
	public List<Client> getByLname(String lname) {
		return clientRepository.findByLname(lname);
	}
	
	public boolean deleteById(long id) {
		try {
			clientRepository.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
