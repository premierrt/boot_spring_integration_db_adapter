package rt.eureka.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * https://kobietydokodu.pl/13-baza-danych-z-jpa-cz-1/
 * @author 
 *
 */
@Entity
@Table(name="usluga")
public class Usluga {

@Id
@GeneratedValue
private int id;
private String name;

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


}
