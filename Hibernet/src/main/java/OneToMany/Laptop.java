package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id 
	private int laptop_id;
	private String laptop_name;
	
	@ManyToOne
	private Employees employee1;
	
	
	
	public Laptop() {
		super();
	}

	public Laptop(int laptop_id, String laptop_name, Employees employee) {
		super();
		this.laptop_id = laptop_id;
		this.laptop_name = laptop_name;
		this.employee1 = employee;
	}

	@ManyToOne
	private Employees employee;

	public int getLaptop_id() {
		return laptop_id;
	}

	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}

	public String getLaptop_name() {
		return laptop_name;
	}

	public void setLaptop_name(String laptop_name) {
		this.laptop_name = laptop_name;
	}

	public Employees getEmployee() {
		return employee1;
	}

	public void setEmployee(Employees employee) {
		this.employee1 = employee;
	}
	
	
	
	
	
	
		}
