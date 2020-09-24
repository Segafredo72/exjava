import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exA4{

public static void main(String[] args){

	String title = "";
	Integer numberOfDays = 0;
	Double pricePerDay = 0.0;
	Boolean priorKnowledgeRequired;
	List<String> instructors = new ArrayList<String>();
	Double totalPrice;
	
	if (args.length==0){
    System.out.println("Error- please type arguments title numberOfDays pricePerDay");
	}
	else {
		 title = args[0];
	     numberOfDays = Integer.parseInt(args[1]);
		 pricePerDay= Double.parseDouble(args[2]);
	}	
	
	/*
	title = "Java Reskilling";
	
	numberOfDays = 25;
	
	pricePerDay = 95.50;
	*/
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
