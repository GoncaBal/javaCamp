package oopSoyutlamaHomework;

public class Student extends User {
	int studentId;
	String registeredCourse;
	
	
	public Student() {}
	
	public Student(int studentId, String registeredCourse) {
		super();
		this.studentId = studentId;
		this.registeredCourse = registeredCourse;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}

	
}
