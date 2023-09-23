package in.sahil.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student 
{
    @Id
	private Integer id;
	
	private String name;
	
	private String studentRank;
	
	public String getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(String studentRank) {
		this.studentRank = studentRank;
	}

	private String gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
