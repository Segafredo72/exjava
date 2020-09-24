public class exB3{

public static void main(String[] args){

	int[] numbers ;
	int total = 0;
	double average = 0;
	
	numbers = new int[10];
	numbers = new int[]{10, 11, 35, 45, 85, 51, 61, 35, 74, 44};
	
	for (int number : numbers) {
			total += number;
	}
	average = (double) total / numbers.length;
	System.out.println("Average is "+ average);
}
}

