package oopSoyutlamaHomework;

public class Instructor extends User {
	 int instructorId;
	 String instructorCourseName;
	
	public Instructor() {}
	
	public Instructor(int instructorId, String instructorCourseName) {
		super();
		this.instructorId = instructorId;
		this.instructorCourseName = instructorCourseName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorCourseName() {
		return instructorCourseName;
	}

	public void setInstructorCourseName(String instructorCourseName) {
		this.instructorCourseName = instructorCourseName;
	}
	
}
