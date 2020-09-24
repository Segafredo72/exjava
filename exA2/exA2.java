import java.util.ArrayList;
import java.util.List;

public class exA2{

public static void main(String[] args){

	String title;
	Integer numberOfDays;
	Double pricePerDay;
	Boolean priorKnowledgeRequired;
	List<String> instructors = new ArrayList<String>();
	
	title = "Java Reskilling";
	numberOfDays = 25;
	pricePerDay = 95.50;
	priorKnowledgeRequired = false;
	
	instructors.add("Sandy");
	instructors.add("Kris");
		
	System.out.println("Course "+ title +" is "+ numberOfDays +" days long at day rate "+ pricePerDay + " EUR" );
	if (priorKnowledgeRequired) {
		System.out.println("Prior knowledge is requireed !");
	}else{
		System.out.println("Prior knowledge is not requireed !");
	}
	System.out.println("Number of instructors is "+ instructors.size());
	for(String instructor: instructors){ 
		System.out.println("Instructors are : " + instructor);
	}
}
}
