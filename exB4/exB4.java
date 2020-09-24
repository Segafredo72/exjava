import java.util.Scanner;

public class exB4{

public static void main(String[] args){

	String language = "";
	
	Scanner readInput = new Scanner(System.in);
	System.out.println("Please enter language :");
	language = readInput.nextLine();
	readInput.close();
	
	switch (language) {
	case "FR":
		System.out.println("Bonjour !");
		break;
	case "NL":
		System.out.println("Goiedag !");
		break;
	case "EN":
		System.out.println("Good day !");
		break;
	default:
		System.out.println("Goiedag, bonjour & Good day !");
	}
		
}
}
