package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int projectId;
	private String projectName;
	@ManyToMany
	private List<Emp> emp;
	
	
	
	
	public Project() {
		super();
	}




	public Project(int projectId, String projectName, List<Emp> emp) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.emp = emp;
	}




	public int getProjectId() {
		return projectId;
	}




	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}




	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}




	public List<Emp> getEmp() {
		return emp;
	}




	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
	
}
