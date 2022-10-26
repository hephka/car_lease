package franck.thevenin.cars_lease.client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findByFname(String fname);
	List<Client> findByLname(String lname);
}
