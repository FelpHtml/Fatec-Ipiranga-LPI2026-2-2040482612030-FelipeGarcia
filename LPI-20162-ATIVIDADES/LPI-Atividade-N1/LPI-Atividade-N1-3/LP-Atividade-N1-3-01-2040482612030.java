import java.util.Scanner;
public class Pgmn13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantidade de Leituras: ");
		int quantidadeLeituras = scanner.nextInt();
		double[] temperaturas = new double[quantidadeLeituras];
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Temperatura (°C): ");
			temperaturas[i] = scanner.nextDouble();
}
			System.out.println("-- Leituras Registradas --");
			for (int i = 0; i < temperaturas.length; i++) {
				System.out.println("Leitura [" + i + "]: " + String.format("%.1f", temperaturas[i]) + "°C");
			}

			System.out.println("-- Acesso Direto --");
			System.out.println("Primeira leitura (indice 0): " + String.format("%.1f", temperaturas[0]) + "°C");
			System.out.println("Ultima leitura (indice " + (temperaturas.length - 1) + "): " + String.format("%.1f", temperaturas[temperaturas.length - 1]) + "°C");

			double maior = temperaturas[0];
			int indiceMaior = 0;
			double menor = temperaturas[0];
			int indiceMenor = 0;
			for (int i = 1; i < temperaturas.length; i++) {
				if (temperaturas[i] > maior) {
					maior = temperaturas[i];
					indiceMaior = i;
				}
				if (temperaturas[i] < menor) {
					menor = temperaturas[i];
					indiceMenor = i;
				}
			}
			System.out.println("-- Busca Linear: Extremos --");
			System.out.println("Maior temperatura: " + String.format("%.1f", maior) + "°C (indice " + indiceMaior + ")");
			System.out.println("Menor temperatura: " + String.format("%.1f", menor) + "°C (indice " + indiceMenor + ")");

			System.out.print("Temperatura crítica de alerta (°C): ");
			double temperaturaCritica = scanner.nextDouble();

			int indiceAlerta = -1;
			for (int i = 0; i < temperaturas.length; i++) {
				if (temperaturas[i] >= temperaturaCritica) {
					indiceAlerta = i;
					break;
				}
			}

			System.out.println("-- Busca Linear: Alerta --");
			if (indiceAlerta != -1) {
				System.out.println("Alerta: temperatura critica atingida na leitura de indice " + indiceAlerta
				                   + " (" + String.format("%.1f", temperaturas[indiceAlerta]) + "°C).");
			} else {
				System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
			}

			scanner.close();

		}
	}