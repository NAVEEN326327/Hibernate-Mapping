//package onetomanypack;
package onetomanypack;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Depart
{
	@Id
	private int did;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="did")
	private Set<Empl> empls;

	public Depart(int did, String name) {
		super();
		this.did = did;
		this.name = name;
	
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Empl> getEmpls() {
		return empls;
	}

	public void setEmpls(Set<Empl> empls) {
		this.empls = empls;
	}
	
	
}

//@Entity 
//public class Depart
//{
//	@Id
//	private int did;
//	private String name;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="did")
//	private Set<Empl> empls;
//	
//}​​