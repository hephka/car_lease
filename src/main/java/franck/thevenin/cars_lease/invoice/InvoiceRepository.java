package franck.thevenin.cars_lease.invoice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	List<Invoice> findByAddress(String address);
	Invoice deleteById(long id);
}
