import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class exC1{

public static void printInfo(String title, int numberOfDays, double pricePerDay, double totalPrice, 
                             boolean priorKnowledgeRequired, int numberOfInstructors, String label){
	System.out.println("Course "+ title +" is "+ numberOfDays +" days long at day rate "+ pricePerDay + " EUR" );
	
	System.out.println("Total price is "+ totalPrice +" EUR and "+label);
	
	if (priorKnowledgeRequired) {
		System.out.println("Prior knowledge is required !");
	}else{
		System.out.println("Prior knowledge is not required !");
	}
	System.out.println("Number of instructors is "+ numberOfInstructors);
	
}

public static void main(String[] args){

	String title = "";
	String label;
	int numberOfDays = 0;
	double pricePerDay = 0.0;
	boolean priorKnowledgeRequired;
	List<String> instructors = new ArrayList<String>();
	double totalPrice;

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

	// If a course takes more than 3 days and you need prior knowledge to follow it, you don’t have to pay the VAT
	if (numberOfDays > 3 && priorKnowledgeRequired){
		totalPrice = numberOfDays * pricePerDay;
	}else {
		totalPrice = numberOfDays * pricePerDay * 1.21 ;
	}
	
	/* We want to label the courses based on the total price:
		< 500 : "CHEAP"
		between 500 and 1500 : "OK"
		> 1500 : "EXPENSIVE" */
	
	if (totalPrice < 500) {
		label = "CHEAP";		
	}else { if (totalPrice <= 1500 ) {
				label = "OK";
			}else {
				label = "EXPENSIVE";
			}
		
	}
	
	printInfo(title, numberOfDays, pricePerDay, totalPrice, priorKnowledgeRequired, instructors.size(),label);
	}
	
	
}
