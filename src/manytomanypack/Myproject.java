package manytomanypack;

import javax.persistence.*;
import java.util.*;

@Entity
public class Myproject {
   @Id
   private int id;
   private String name;
   private String technology;
   
   @ManyToMany(targetEntity=Emps.class, cascade=CascadeType.ALL)
   @JoinTable(name="Emps_Project")
   private Set<Emps> emps;
   public Myproject() {
	   
   }
public Myproject(int id, String name, String technology) {
	super();
	this.id = id;
	this.name = name;
	this.technology = technology;
	
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
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public Set<Emps> getEmps() {
	return emps;
}
public void setEmps(Set<Emps> emps) {
	this.emps = emps;
}
   
   
}
