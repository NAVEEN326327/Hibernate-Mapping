//package onetomanypack;
//
package onetomanypack;
import javax.persistence.*;

@Entity
public class Empl{
	@Id
	private int eid;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="did")
	private Depart depart;
	
	public Empl() {}

	public Empl(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}
	
	

}
