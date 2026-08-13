import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores
        System.out.print("Informe o valor A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o valor B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o valor C: ");
        double c = scanner.nextDouble();
        System.out.print("Informe o valor D: ");
        double d = scanner.nextDouble();
        System.out.print("Informe a média do aluno: ");
        double media = scanner.nextDouble();
        System.out.print("Informe o percentual de presença: ");
        double presenca = scanner.nextDouble();

        // Demonstração da precedência aritmética
        double resultadoSemParenteses = a + b * c / d;
        double resultadoComParenteses = a + ((b * c) / d);
        System.out.println("--- Demonstração de Precedência Aritmética --");
        System.out.println("Resultado Sem parênteses: " + resultadoSemParenteses);
        System.out.println("Resultado Com parênteses explícitos: " + resultadoComParenteses);
        System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, / depois +), " + "mas a segunda forma é mais legível.");

        // Validação do critério de aprovação direta
        boolean aprovadoDireto = (media >= 6) && (presenca >= 75);
        System.out.println("--- Validação do Critério de Aprovação --");
        System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        scanner.close();
    }
}