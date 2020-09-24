public class exA1{

public static class Course {
	String title;
	Integer numberOfDays;
	Double pricePerDay;
}

public static void main(String[] args){
	Course course = new Course();
	course.title = "Java Reskilling";
	course.numberOfDays =25;
	course.pricePerDay = 95.50;
	
	System.out.println("Course "+ course.title +" is "+ course.numberOfDays +" days long at day rate "+ course.pricePerDay + " EUR" );

}
}
