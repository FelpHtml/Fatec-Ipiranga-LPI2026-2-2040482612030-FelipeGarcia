import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Leitura dos valores como String
        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = scanner.nextLine();
        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = scanner.nextLine();
        System.out.print("Informe o valor total da compra: ");
        String valorCompra = scanner.nextLine();
        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        //Demonstração da imprecisão do double
        System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) --");
        double aDouble = Double.parseDouble(valorA);
        double bDouble = Double.parseDouble(valorB);
        double resultadoDouble = aDouble - bDouble;
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria 0.10");
        System.out.println("Resultado real obtido com double: " + resultadoDouble);

        //Correção utilizando BigDecimal
        System.out.println("--- Correção exata utilizando java.math.BigDecimal --");
        BigDecimal aBigDecimal = new BigDecimal(valorA);
        BigDecimal bBigDecimal = new BigDecimal(valorB);
        BigDecimal resultadoBigDecimal = aBigDecimal.subtract(bBigDecimal);
        System.out.println("Resultado com BigDecimal (String Constructor): "+ resultadoBigDecimal);

        //Divisão das parcelas
        System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP --");
        BigDecimal compra = new BigDecimal(valorCompra);
        BigDecimal valorParcela = compra.divide(BigDecimal.valueOf(numeroParcelas),2,RoundingMode.HALF_UP);
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");

        scanner.close();
    }
}