import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class exA5{

public static void main(String[] args){

	String title = "";
	Integer numberOfDays = 0;
	Double pricePerDay = 0.0;
	Boolean priorKnowledgeRequired;
	List<String> instructors = new ArrayList<String>();
	Double totalPrice;

	priorKnowledgeRequired = false;
	
	instructors.add("Sandy");
	instructors.add("Kris");
	
	Scanner readInput = new Scanner(System.in);
	System.out.println("Please enter a title :");
	title = readInput.nextLine(); 
			
	System.out.println("Please enter number of days :");
	numberOfDays = readInput.nextInt(); 
	
	System.out.println("Please enter daily rate :");
	pricePerDay = readInput.nextDouble(); 
	
	readInput.close();

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
