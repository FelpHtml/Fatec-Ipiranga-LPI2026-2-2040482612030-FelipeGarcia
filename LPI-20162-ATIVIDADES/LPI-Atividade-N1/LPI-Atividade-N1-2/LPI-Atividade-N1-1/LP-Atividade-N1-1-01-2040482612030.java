import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //byte: 8bits - intervalo de -128 a 127
        System.out.print("Idade do Aluno: ");
        byte idade = scanner.nextByte();
        //short: 16bits - intervalo de -32.768 a 32.767
        System.out.print("Número de Faltas: ");
        short faltas = scanner.nextShort();
        //int: 32bits - intervalo de -2.147.483.648 a 2.147.483.647
        System.out.print("Matrícula ID: ");
        int matriculaId = scanner.nextInt();
        //long : 64bits - intervalo de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = scanner.nextLong();
        //float : 32bits - de 6 a 7 casas decimais com precisão
        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = scanner.nextFloat();
        //double : 64bits - de 15 a 16 casas decimais com precisão
        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = scanner.nextDouble();
        //char : 16bits - valor Unicode de '\u0000' até '\uffff'
        System.out.print("conceito Final do Aluno: ");
        char conceitoFinal = scanner.next().charAt(0);
        //boolean não possui valor definido, pois só armazena true ou false
        System.out.print("Aluno está aprovado (true/false): ");
        boolean aprovado = scanner.nextBoolean();

        System.out.println("---Dados do Aluno Fictício---");
        System.out.println("Idade do Aluno: " + idade + "anos");
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matrícula do ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno aprovado?: " + aprovado);
        
        scanner.close();
    }

}
