package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# + ANGULAR Kursu", "Engin", "Demiroğ", " ");
		Course course2 = new Course(2, "JAVA + REACT Kursu", "Engin", "Demiroğ", " ");
		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.name);
		}
		CourseManager courseManager = new CourseManager();
		courseManager.addInfo(course2);
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com");

		InstructorManager instructorManager=new InstructorManager(instructor1);
		instructorManager.addToInstructor(course1);
		
		User user1=new User(1, "Gonca", "goncabal@gmail.com", "1234");
		
		UserManager userManager=new UserManager();
		userManager.updateUserInfo(user1);
		
	}
		
}
