/*A estrututra for é a mais adequada, pois a quantidade de repetições já é conhecida antecipadamente
 O laço será executado exatamente uma vez para cada aluno informado*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantidadeAluno;
        double nota;
        double somaTotal = 0;
        double maiorNota = 0;
        System.out.print("Quantidade de alunos na turma:");
        quantidadeAluno = scanner.nextInt();
        
        for(int i =0; i < quantidadeAluno; i++){
            System.out.print("Nota do aluno:");
            nota = scanner.nextDouble();

        somaTotal += nota;

        if(nota>maiorNota){
            maiorNota = nota;
        }

        }
        double mediaTurma = somaTotal/quantidadeAluno;

        System.out.println("Soma total das notas: " + somaTotal);
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Maior nota da turma: " + maiorNota);

        scanner.close();

    }
}
