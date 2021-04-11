import java.io.IOException;
import java.util.Scanner;

public class URI1019 {
	public static void main(String[]args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		
		int m = valor/60;
		int minutos = m%60;
		int segundos = valor%60;
		int horas = m/60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos );
		
		scanner.close();
	}
}
