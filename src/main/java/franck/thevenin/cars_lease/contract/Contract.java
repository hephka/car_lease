package franck.thevenin.cars_lease.contract;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import franck.thevenin.cars_lease.car.Car;
import franck.thevenin.cars_lease.client.Client;
import franck.thevenin.cars_lease.invoice.Invoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "contract")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Temporal(TemporalType.DATE)
	private Date startLease;
	
	@Temporal(TemporalType.DATE)
	private Date endLease;
	
	private double totalPrice;
	
	private double advance;
	
	@Column(length = 30)
	private double leftToPay;
	
	private String placeOfReturn;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Car car;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Client client;
	
	@OneToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Invoice invoice;
	
}
