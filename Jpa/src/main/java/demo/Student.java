package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

//POJO Class
@Entity(name="Student_HQL")
@Table(appliesTo="Student_HQL")
public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private int studentMarks;
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
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	
	

}
