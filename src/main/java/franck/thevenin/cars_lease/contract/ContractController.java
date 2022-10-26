
package franck.thevenin.cars_lease.contract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contracts")
@CrossOrigin(origins = "http://localhost:3000")
public class ContractController {
	@Autowired
	ContractService contractService;
	
	@GetMapping("/")
	public List<Contract> getAllContracts() {
		return contractService.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Contract> getContractById(@PathVariable("id") long id) {
		Contract contract = contractService.getById(id);
		
		if(contract != null)
			return new ResponseEntity<>(contract, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Contract> deleteContractById(@PathVariable("id") long id) {
		if (contractService.deleteById(id) == true)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/")
	public ResponseEntity<Contract> createNewContract(@RequestBody Contract contract) {
		try {
			Contract newContract = contractService.save(contract);
			return new ResponseEntity<>(newContract, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Contract> updateContractById(@PathVariable("id") long id, @RequestBody Contract contract) {
      Contract existingContract= contractService.getById(id);

      if (existingContract != null) {
        Contract updatedContract = new Contract();
        updatedContract.setId(existingContract.getId());
        updatedContract.setDate(contract.getDate());
        updatedContract.setStartLease(contract.getStartLease());
        updatedContract.setEndLease(contract.getEndLease());
        updatedContract.setTotalPrice(contract.getTotalPrice());
        updatedContract.setAdvance(contract.getAdvance());
        updatedContract.setLeftToPay(contract.getLeftToPay());
        updatedContract.setPlaceOfReturn(contract.getPlaceOfReturn());
        return new ResponseEntity<>(contractService.save(updatedContract), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
}
