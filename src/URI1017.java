import java.io.IOException;
import java.util.Scanner;

/**
 * carroJoao = 12km/l
 * tempoGasto = em horas
 * velocidadeMedia = km/h
 * distanciaPercorrida = velocidadeMedia * tempoGasto
 * kistroGastos = distanciaPecorrida / 12; 
 * @author gutug
 *
 */
public class URI1017 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int tempoGasto = scanner.nextInt();
		int velocidadeMedia = scanner.nextInt();
		
		double distanciaPercorrida = velocidadeMedia*tempoGasto;
		double litrosGastos = distanciaPercorrida/12;
		
		System.out.println(String.format("%.3f", litrosGastos));
	}
}
