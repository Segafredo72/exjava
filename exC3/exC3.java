public class exC3{

public static void main(String[] args){
	
	int[] numbers = {10, 11, 35, 45, 85, 51, 61, 35, 74, 44};
	int total = 0;
	double average = 0;
		
	DoMath doMath = new DoMath();	
	System.out.println("Average is "+ doMath.calculateAverage(numbers));
}
}

