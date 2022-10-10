package OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Table")
public class Employees {
	@Id
	private int emp_id;
	private String emp_name;
	
	@OneToMany
	
	private List<Laptop> laptop;
	
	
	

	public Employees() {
		super();
	}




	public Employees(int emp_id, String emp_name, List<Laptop> laptop) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.laptop = laptop;
	}




	public int getEmp_id() {
		return emp_id;
	}




	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}




	public String getEmp_name() {
		return emp_name;
	}




	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}




	public List<Laptop> getLaptop() {
		return laptop;
	}




	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	
	

}
