import java.util.Scanner;
public class Main {
    //Constantes institucionais - não podem ser alteradas
public static final String INSTITUICAO = "Fatec Ipiranga";
public static final int PRAZO_MAXIMO_EMPRESTIMO = 14;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o número de dias do empréstimo: ");
    final int diasEmprestimo = scanner.nextInt();
    final int diasDevolucao = calcularDataLimite(diasEmprestimo);

    System.out.println("Instituição: " + INSTITUICAO);
    System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_EMPRESTIMO + " dias.");
    System.out.println("Dias calculados para devolução: " + diasDevolucao);

    scanner.close();
}
//O parâmetro final não pode receber outro valor dentro do método
public static int calcularDataLimite(final int diasEmprestimo) {
    final int diasDevolucao;

    if (diasEmprestimo <= PRAZO_MAXIMO_EMPRESTIMO) {
        diasDevolucao = diasEmprestimo;
    } else{
        diasDevolucao = PRAZO_MAXIMO_EMPRESTIMO;
    }
    //ERRO DE COMPILAÇÃO:
    //diasDevolucao = 20;
    //Uma variável final não pode ser retribuída depois de receber um valor.

    return diasDevolucao;
}

}
