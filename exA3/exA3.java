import java.util.ArrayList;
import java.util.List;

public class exA3{

public static void main(String[] args){

	String title;
	Integer numberOfDays;
	Double pricePerDay;
	Boolean priorKnowledgeRequired;
	List<String> instructors = new ArrayList<String>();
	Double totalPrice;
	
	title = "Java Reskilling";
	numberOfDays = 25;
	pricePerDay = 95.50;
	priorKnowledgeRequired = false;
	
	
	instructors.add("Sandy");
	instructors.add("Kris");
	
	totalPrice = numberOfDays * pricePerDay * 1.21;
	
	System.out.println("Course "+ title +" is "+ numberOfDays +" days long at day rate "+ pricePerDay + " EUR" );
	
	System.out.println("Total price incl 21% VAT is "+ totalPrice +" EUR");
	
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
