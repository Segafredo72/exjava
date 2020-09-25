import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.File;

public class ExD2{

public static void printInfo(String title, int numberOfDays, double pricePerDay, 
                             boolean priorKnowledgeRequired, int numberOfInstructors){
	String label;
	double totalPrice;
	
	
	try{
	FileWriter myWriter = new FileWriter("courseinfo.txt");
	myWriter.write("Course "+ title +" is "+ numberOfDays +" days long at day rate "+ pricePerDay + " EUR"+" \n" );
	
	totalPrice = totalPriceCalculation(numberOfDays, pricePerDay, priorKnowledgeRequired);
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
	myWriter.write("Total price is "+ totalPrice +" EUR and "+label+" \n");
	
	if (priorKnowledgeRequired) {
		myWriter.write("Prior knowledge is required ! \n");
	}else{
		myWriter.write("Prior knowledge is not required ! \n");
	}
	
	myWriter.write("Number of instructors is "+ numberOfInstructors+" \n");
	
	myWriter.close();
	
	}catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}

public static double totalPriceCalculation (int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired){
	// If a course takes more than 3 days and you need prior knowledge to follow it, you don’t have to pay the VAT
	if (numberOfDays > 3 && priorKnowledgeRequired){
		return numberOfDays * pricePerDay;
	}else {
		return numberOfDays * pricePerDay * 1.21;
	}
}

public static String getTitle(){
	String title;
	Scanner readInput = new Scanner(System.in);
	System.out.println("Please enter a title :");
	title = readInput.nextLine(); 
	return title;
}

public static int getNumberOfDays(){
	Scanner readInput = new Scanner(System.in);
	boolean continueInput = true;
	int numberOfDays = 0;
	do {
	try{
		System.out.println("Please enter number of days :");
		numberOfDays = readInput.nextInt(); 
		continueInput = false;	
	}catch (InputMismatchException ex) {
		System.out.println("Please enter a valid number of days :");
		readInput.nextLine(); 
	}
	} while (continueInput);
	return numberOfDays;
}

public static double getPricePerDay(){
	Scanner readInput = new Scanner(System.in);
	boolean continueInput = true;
	double pricePerDay = 0;
	do{
	try{
		System.out.println("Please enter price per day :");
		pricePerDay = readInput.nextDouble();
		continueInput = false;	
	}catch (InputMismatchException ex) {
		System.out.println("Please enter a valid price per day :");
		readInput.nextLine(); 
	}
	}while(continueInput);
	return pricePerDay;
}

public static void CreateFile (){
     try {
      File myObj = new File("courseinfo.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
	  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }




public static void main(String[] args){

	String title = "";
	String label;
	int numberOfDays = 0;
	double pricePerDay = 0.0;
	boolean priorKnowledgeRequired;
	List<String> instructors = new ArrayList<String>();
	double totalPrice;

	priorKnowledgeRequired = true;
	
	instructors.add("Sandy");
	instructors.add("Kris");
	
	CreateFile();
	getTitle();
				
	numberOfDays = getNumberOfDays(); 
		
	pricePerDay = getPricePerDay(); 
	
		
	printInfo(title, numberOfDays, pricePerDay, priorKnowledgeRequired, instructors.size());
	}
	
	
}
