package oopIntroHomework;

public class Course {
	public Course(int id, String name, String instructorFirstName, String instructorLastName,String info) {
		super();
		this.id = id;
		this.name = name;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName=instructorLastName;
		this.info = info;
	}
	public Course() {}
	int id;
	String name;
	String instructorFirstName;
	String instructorLastName;
	String info;
}
