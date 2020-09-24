import java.util.Scanner;

public class exB5{

public static void main(String[] args){

	char again = 'Y';
	Scanner readInput = new Scanner(System.in);
	
	do{
	System.out.println("Welcome !");
	System.out.println("Would you like to be greated again Y/N ?");
	again = readInput.next().charAt(0); 
			
	} while (again == 'Y');
	readInput.close();
}
}
