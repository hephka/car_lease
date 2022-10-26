package franck.thevenin.cars_lease;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import franck.thevenin.cars_lease.car.Car;
import franck.thevenin.cars_lease.car.CarService;
import franck.thevenin.cars_lease.client.Client;
import franck.thevenin.cars_lease.client.ClientService;
import franck.thevenin.cars_lease.contract.Contract;
import franck.thevenin.cars_lease.contract.ContractService;

@SpringBootApplication
public class CarsLeaseApplication implements CommandLineRunner {
	@Autowired
	CarService carService;
	
	@Autowired
	ClientService clientService;
	
	@Autowired
	ContractService contractService;

	public static void main(String[] args) {
		SpringApplication.run(CarsLeaseApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Car car = new Car();
		
		car.setRegistration("AM421PM");
		car.setBrand("Mercedes");
		car.setColor("Noir");
		car.setFuel("Diesel");
		car.setPower(6.3);
		car.setMaxSpeed(300);
		car.setKm(51000);
		car.setInUse(false);
		car.setFirstUse(Date.valueOf("2022-02-10"));
		carService.save(car);
		
		car = new Car();
		car.setRegistration("DZ113FK");
		car.setBrand("Renault");
		car.setColor("Blanche");
		car.setFuel("Essence");
		car.setPower(2);
		car.setMaxSpeed(210);
		car.setKm(112000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2018-08-19"));
		carService.save(car);
		
		car = new Car();
		car.setRegistration("DZ113FK");
		car.setBrand("Renault");
		car.setColor("Blanche");
		car.setFuel("Essence");
		car.setPower(2);
		car.setMaxSpeed(210);
		car.setKm(112000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2018-08-19"));
		carService.save(car);
		
		car = new Car();
		car.setRegistration("DZ113FK");
		car.setBrand("Renault");
		car.setColor("Blanche");
		car.setFuel("Essence");
		car.setPower(2);
		car.setMaxSpeed(210);
		car.setKm(112000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2018-08-19"));
		carService.save(car);
		
		car = new Car();
		car.setRegistration("DZ113FK");
		car.setBrand("Renault");
		car.setColor("Blanche");
		car.setFuel("Essence");
		car.setPower(2);
		car.setMaxSpeed(210);
		car.setKm(112000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2018-08-19"));
		carService.save(car);
		
		car = new Car();
		car.setRegistration("DZ113FK");
		car.setBrand("Renault");
		car.setColor("Blanche");
		car.setFuel("Essence");
		car.setPower(2);
		car.setMaxSpeed(210);
		car.setKm(112000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2018-08-19"));
		carService.save(car);
		
		car = new Car();
		car.setRegistration("DZ113FK");
		car.setBrand("Renault");
		car.setColor("Blanche");
		car.setFuel("Essence");
		car.setPower(2);
		car.setMaxSpeed(210);
		car.setKm(112000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2018-08-19"));
		carService.save(car);
		
		Client client = new Client();
		
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		client = new Client();
		client.setFname("Franck");
		client.setLname("Thevenin");
		client.setAddress("1 Allée du Code");
		client.setDob(Date.valueOf("1991-12-15"));
		client.setFidelity(9);
		clientService.save(client);
		
		
		Contract contract = new Contract();

	    contract.setDate(Date.valueOf("2022-03-03"));
	    contract.setStartLease(Date.valueOf("2022-03-03"));
	    contract.setEndLease(Date.valueOf("2022-03-03"));
	    contract.setTotalPrice(5000);
	    contract.setAdvance(1500);
	    contract.setLeftToPay(3500);
	    contract.setPlaceOfReturn("Paris");
	    contractService.save(contract);
		
	}

}
