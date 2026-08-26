/*A estrututra while é a mais adequada, pois não se sabe o número certo de vendas totais
o laço só ira acabar quando o valor informado for igual a 0 */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double valorVendas;
        double totalVendido = 0;
        int quantidadeVendas = 0;
        System.out.print("Valor da Venda (ou 0 para encerrar): ");
            valorVendas = scanner.nextDouble();

        while(valorVendas != 0){
            totalVendido += valorVendas;
            quantidadeVendas++;
            System.out.print("Valor da Venda (ou 0 para encerrar): ");
            valorVendas = scanner.nextDouble();
        }

        if(quantidadeVendas > 0){
            double mediaVendas = totalVendido/quantidadeVendas;
            System.out.println("Total vendido no turno: R$" + totalVendido);
            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf("Valor médio por venda: R$ %.2f%n", mediaVendas);
        } else{
            System.out.println("Nenhuma venda registrada nestea sessão de caixa.");
        }

        scanner.close();
    }
}