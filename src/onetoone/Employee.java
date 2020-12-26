package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	int empId;
	String name;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=ParkingSpace.class)
	@JoinColumn(name="parkingId",unique=true)
	ParkingSpace space;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ParkingSpace getSpcae() {
		return space;
	}

	public void setSpcae(ParkingSpace space) {
		this.space = space;
	}
	
	
}
