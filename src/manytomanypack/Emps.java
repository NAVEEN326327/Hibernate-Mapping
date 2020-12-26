package manytomanypack;

import javax.persistence.*;
import java.util.*;

@Entity
public class Emps {
 
	@Id
	private int id;
	private String name;
	
	@ManyToMany(targetEntity=Myproject.class,cascade=CascadeType.ALL)
	@JoinTable(name="Emps_Project")
	private Set<Myproject> myproject;

	public Emps() {}
	public Emps(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Myproject> getMyproject() {
		return myproject;
	}

	public void setMyproject(Set<Myproject> myproject) {
		this.myproject = myproject;
	}
	
	
	
	
}
