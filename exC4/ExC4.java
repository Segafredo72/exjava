import java.util.Scanner;

public class ExC4{

public static void Welcome(){
	char again = 'Y';
	Scanner readInput = new Scanner(System.in);
	System.out.println("Welcome !");
	System.out.println("Would you like to be greated again Y/N ?");
	again = readInput.next().charAt(0); 
	if (again=='Y') {
		Welcome();
	}else {
	readInput.close();
	return;	
	}
}

public static void main(String[] args){

	Welcome();
	
}
}
