package oopIntroHomework;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kurs listeye eklendi.");
	}

	public void deleteCourse(Course course) {
		System.out.println("Kurs listeden silindi.");
	}

	public void updateCourse(Course course) {
		System.out.println("Kurs adı güncellendi.");
	}

	public void addInfo(Course course) {
		System.out.println(course.name+" infosu başarıyla eklendi.");
	}

	public void updateInfo(Course course) {
		System.out.println(course.name+" infosu güncellendi.");
	}

	public void deleteInfo(Course course) {
		System.out.println(course.name+" info bilgisi silindi.");
	}
}
