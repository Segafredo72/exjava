import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class exA6{

public static void main(String[] args){

	int remainingDays = 0;
	
	Map<String, Integer> months = new HashMap <String, Integer>();
	
	months.put("JAN", 31);
	months.put("FEB", 28);
	months.put("MAR", 31);
	months.put("APR", 30);
	months.put("MAI", 31);
	months.put("JUN", 30);
	months.put("JUL", 31);
	months.put("AUG", 31);
	months.put("SEP", 30);
	months.put("OCT", 31);
	months.put("NOV", 30);
	months.put("DEC", 31);
	

	Scanner readInput = new Scanner(System.in);
	System.out.println("Please enter month JAN/FEB/MAR/APR/MAI/JUN/JUL/AUG/SEP/OCT/NOV/DEC :");
	String inputedMonth = readInput.nextLine(); 
				
	System.out.println("Please enter day in month :");
	int inputedDay = readInput.nextInt(); 
	
	readInput.close();
	
	for (Map.Entry<String,Integer> month : months.entrySet()){
		if (month.getKey().equals(inputedMonth)) {
		remainingDays = month.getValue() - inputedDay;
		System.out.println("Remaining days for month "+ inputedMonth + " are "+ remainingDays );
		}
	}

}
}
