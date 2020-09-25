import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.File;

public class ExE1{

public static void printSalaryHistory(String firstName, int currentAge, int startedAge, double startSalary){
	
	double increasedSalary = 0;	
	int stopAge = 0;	
	int nextAge = 0;
		
	try{
		
	FileWriter myWriter = new FileWriter("salaryhistory.txt");
	
	stopAge = startedAge + 35;
	increasedSalary = startSalary;
	nextAge = startedAge;
	
	do{
	
	myWriter.write("Salary of "+ firstName + " at " + nextAge + " is " + increasedSalary +"\n" );
	
	
    nextAge +=5;
	increasedSalary *= 1.03;
    
	} while(nextAge < stopAge && nextAge <= currentAge);
	
	if (nextAge >= stopAge) {
		myWriter.write("Maximum salary reached \n" );
	}
	 
	myWriter.close();
	
	}catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}


public static String getName(String firstLast){
	String name;
	Scanner readInput = new Scanner(System.in);
	System.out.println("Please enter instructor's "+firstLast+" name :");
	name = readInput.nextLine(); 
	return name;
}

public static int getAge(String whatAge){
	Scanner readInput = new Scanner(System.in);
	boolean continueInput = true;
	int age	= 0;
	do {
	try{
		System.out.println("Please input instructor age "+whatAge+" :");
		age = readInput.nextInt(); 
		continueInput = false;	
	}catch (InputMismatchException ex) {
		System.out.println("Please enter a valid age :");
		readInput.nextLine(); 
	}
	} while (continueInput);
	return age;
}

public static double getSalary(){
	Scanner readInput = new Scanner(System.in);
	boolean continueInput = true;
	double salary = 0;
	do{
	try{
		System.out.println("Please enter starting salary:");
		salary = readInput.nextDouble();
		continueInput = false;	
	}catch (InputMismatchException ex) {
		System.out.println("Please enter a valid salary :");
		readInput.nextLine(); 
	}
	}while(continueInput);
	return salary;
}


public static void createFile (){
     try {
      File myObj = new File("salaryhistory.txt");
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

	String instructorFirstName = "";
	String instructorLastName = "";
	int instructorCurrentAge = 0;
	int instructorStartAge = 0;
	double instructorSalary = 0;
	
	instructorFirstName = getName("First");
	instructorLastName = getName("Last");
	instructorCurrentAge = getAge("today");
    instructorStartAge = getAge("when started at ABIS");
	instructorSalary = getSalary();
		
	printSalaryHistory(instructorFirstName, instructorCurrentAge, instructorStartAge, instructorSalary);
	}
	
	
}
