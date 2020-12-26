package sequencepack;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
//
//
//
//@Entity
//public class Author {​​
//
 @Entity
 public class Author{
	 @Id
	 @GeneratedValue(strategy = GenrationType.SEQUENCE, generator = "author_generator")
	 @SequenceGenrator(name="author_genratro", sequenceName = "auth_seq")
	 private String name;
 }
//
//
//@Id
//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
//@SequenceGenerator(name="author_generator", sequenceName = "auth_seq")
//private int id;
//private String name;
//
//public Author(){​​}​​
//
//
//
//public Author( String name) {​​
//this.name = name;
//}​​
//
//
//
//public int getId() {​​
//return id;
//}​​
//
//
//
//public void setId(int id) {​​
//this.id = id;
//}​​
//
//
//
//public String getName() {​​
//return name;
//}​​
//
//
//
//public void setName(String name) {​​
//this.name = name;
//}​​
//
//
//
//}​​