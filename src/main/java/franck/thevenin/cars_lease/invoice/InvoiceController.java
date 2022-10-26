package franck.thevenin.cars_lease.invoice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping("/")
	public List<Invoice> getAllInvoices() {
		return invoiceService.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Invoice> getInvoiceById(@PathVariable("id") long id) {
		Invoice invoice = invoiceService.getById(id);
		
		if(invoice != null) 
			return new ResponseEntity<>(invoice, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/address/{address}")
	public ResponseEntity<List<Invoice>> getInvoiceByAddress(@PathVariable("address") String address) {
		List<Invoice> invoices = invoiceService.getByAddress(address);
		
		return new ResponseEntity<>(invoices, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Invoice> deleteInvoiceById(@PathVariable("id") long id) {
		try {
			Invoice deletedInvoice = invoiceService.deleteById(id);
			return new ResponseEntity<>(deletedInvoice, HttpStatus.NO_CONTENT);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<Invoice> createNewInvoice(Invoice invoice) {
		try {
			Invoice newInvoice = invoiceService.save(invoice);
			return new ResponseEntity<>(newInvoice, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
