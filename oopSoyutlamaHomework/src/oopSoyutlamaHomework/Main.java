package oopSoyutlamaHomework;

public class Main {

	public static void main(String[] args) {
	
			Student student1= new Student();
			student1.setId(1);
			student1.setStudentId(1);			
			student1.setFirstName("Gonca");
			student1.setLastName("Bal");
			student1.setUserName("gonca");
			student1.setMailadress("goncabal@gmail.com");
			student1.setPassword("1234");
						
			Instructor instructor1=new Instructor();
			instructor1.setId(2);
			instructor1.setInstructorId(1);
			instructor1.setFirstName("Engin");
			instructor1.setLastName("Demiroğ");
			instructor1.setUserName("engin");
			instructor1.setMailadress("engindemirog@gmail.com");
			instructor1.setPassword("78910");
									
			Course course1= new Course(1, "C# + React");
			Course course2=new Course(2, "Java + Spring");
			
			StudentManager studentManager=new StudentManager();
			studentManager.registerCourse(student1,course1);
			studentManager.registerCourse(student1,course2);
			studentManager.attendance();
			
			InstructorManager instructorManager=new InstructorManager();
			instructorManager.addCourse(instructor1, "Python");
			
			Student student2=new Student();
			student2.setUserName("Reyhan");
			Instructor instructor2=new Instructor();
			instructor2.setUserName("Kerem");
			
			UserManager userManager=new UserManager();
			userManager.registerSystem(student2);
			userManager.registerSystem(instructor2);
		
	}

}
