import java.io.IOException;
import java.util.Scanner;

public class URI1016 {
	public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
		
		int y = leitor.nextInt();
		
		int distanciaY = (y * 60) / 30;
		
		System.out.println(distanciaY + " minutos");
		
	}
}
