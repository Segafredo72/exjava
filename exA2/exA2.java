import java.util.ArrayList;
import java.util.List;

public class exA2{

public static void main(String[] args){

	String title;
	Integer numberOfDays;
	Double pricePerDay;
	List<String> instructors = new ArrayList<String>();
	
	title = "Java Reskilling";
	numberOfDays = 25;
	pricePerDay = 95.50;
	
	instructors.add("Sandy");
	instructors.add("Kris");
		
	System.out.println("Course "+ title +" is "+ numberOfDays +" days long at day rate "+ pricePerDay + " EUR" );

	System.out.println("Number of instructors is "+ instructors.size());
	for(String instructor: instructors){ 
		System.out.println("Instructors are : " + instructor);
	}
}
}
