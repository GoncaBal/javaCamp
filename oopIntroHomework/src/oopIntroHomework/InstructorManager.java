package oopIntroHomework;


public class InstructorManager {
	
	private Instructor instructor;
	public InstructorManager(Instructor instructor) {
		this.instructor=instructor;
	}
		
	
	public void addToInstructor(Course course) {
		System.out.println(course.name+" hocası "+instructor.firstname+" "+instructor.lastName+" olarak eklendi.");
	}
	public void updateToInstructor(Course course) {
		System.out.println(course.name+" hocası "+instructor.firstname+" "+instructor.lastName+"olarak güncellendi.");
	}
}
