import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = scanner.nextDouble();
        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        // Converte o valor em reais para centavos.
        // Exemplo: R$ 100,00 -> 10000 centavos.
        long valorTotalCentavos = Math.round(valorTotalReais * 100);

        // Todas as operações são realizadas utilizando valores inteiros.
        long valorParcelaCentavos = valorTotalCentavos / numeroParcelas;
        System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorTotalCentavos + " centavos.");
        System.out.println("Divisão de R$" + String.format("%.2f", valorTotalReais) + " por " + numeroParcelas + " em centavos: " + valorParcelaCentavos + " centavos por parcela.");

        // Converte centavos para reais apenas no momento da exibição.
        double valorParcelaReais = valorParcelaCentavos / 100.0;
        System.out.println("Valor convertido para exibição: R$ " + String.format("%.2f", valorParcelaReais));

        /*Em relação ao BigDecimal 
          Vantagens:
          - É mais simples e rápido para operações com valores inteiros.
          - Evita problemas de precisão durante os cálculos.
          - É uma abordagem bastante utilizada em sistemas financeiros.
         
          Desvantagens:
          - É necessário converter os valores entre reais e centavos.
          - Pode ser menos flexível para cálculos financeiros mais complexos.
          - É preciso tomar cuidado com valores que possuem mais de duas casas decimais.
         
          O BigDecimal é mais adequado quando se precisa realizar cálculos
          financeiros complexos com precisão decimal e diferentes escalas.
         */

        scanner.close();
    }
}