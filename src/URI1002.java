import java.io.IOException;
import java.util.Scanner;

public class URI1002 {
	public static void main(String[]args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		double raio = scanner.nextDouble();
		double n = 3.14159;
		double area = n * Math.pow(raio, 2);
		
		System.out.println("A=" + String.format("%.4f", area));
	}
}
