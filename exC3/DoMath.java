public class DoMath{
	
public static double calculateAverage(int[] numbers){
	int total = 0;
	for (int number : numbers) {
			total += number;
	}
	return (double) total / numbers.length;
	
}
}
