import java.io.IOException;
public class ExF1 {

	public static void main(String[] args) {

		Course course1 = new Course("JavaScript", 4, 230.0, false);
		course1.addInstructor("Sandy");
		course1.addInstructor("Gie");
		Course course2 = new Course("Python", 3, 300.0, true);
		course2.addInstructor("Lieven");
		Course course3 = new Course("C++", 7, 125.0, false);
		course2.addInstructor("Franz");
		course2.addInstructor("Kris");
		
		
		course3.setTitle("OOCobol");
		
		Course[] courses = { course1, course2, course3 };

		try {
			for (Course course : courses) {
				System.out.println(course.getTitle() + " costs " + course.calculatePrice());
				course.printInfo();
			}
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}