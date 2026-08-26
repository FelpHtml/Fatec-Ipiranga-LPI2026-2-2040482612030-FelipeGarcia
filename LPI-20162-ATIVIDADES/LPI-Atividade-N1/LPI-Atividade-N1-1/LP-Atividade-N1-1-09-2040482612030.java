import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();
        
        //Estrutura Condicional Tradiciional 
        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        String situacaoIfElse;
        if(notaFinal >= 6) {
            situacaoIfElse = "Aprovado";
        } else{
            situacaoIfElse = "Reprovado";
        }
        System.out.println("Situação (if-else): " + situacaoIfElse);

        //Operador Ternário
        System.out.println("--- Abordagem 2: Operdador Ternário Simples ---");
        String situacaoTernario = (notaFinal >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("Siuação (Ternário): " + situacaoTernario);

        /*Exemplo de ernário encadeado caso existisse um terceiro estado:
        String situacao3 = (notaFinal >= 6) ? "Aprovado" : (notaFinal >= 4) ? "Exame" : "Reprovado";
        
        Esse formato deve ser evitado, pois ternários cadeados dificultam a leitura do código.
        Nesse caso, um if/else seria melhor.
        */

        scanner.close();
    }
}