public class exB3{

public static void main(String[] args){

	int[] numbers ;
	int total = 0;
	double average = 0;
	
	numbers = new int[10];
	numbers = new int[]{10, 11, 35, 45, 85, 51, 61, 35, 74, 44};
	
	for (int i=0; i<10; i++) {
			total += numbers[i];
	}
	average = (double) total / 10;
	System.out.println("Average is "+ average);
}
}

