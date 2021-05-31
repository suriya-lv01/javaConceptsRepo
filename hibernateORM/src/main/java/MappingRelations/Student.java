package MappingRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	@ManyToMany(mappedBy="student")
	private List<Laptop> studentLaptop=new ArrayList<Laptop>();

	public List<Laptop> getStudentLaptop() {
		return studentLaptop;
	}

	public void setStudentLaptop(List<Laptop> studentLaptop) {
		this.studentLaptop = studentLaptop;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
