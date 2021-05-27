package kodlamaio.hrms.entitites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="job_title")
	private String jobTitle;
	
	public JobPosition() {
		super();
	}

	public JobPosition(int id, int employeeId, String jobTitle) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}
}
