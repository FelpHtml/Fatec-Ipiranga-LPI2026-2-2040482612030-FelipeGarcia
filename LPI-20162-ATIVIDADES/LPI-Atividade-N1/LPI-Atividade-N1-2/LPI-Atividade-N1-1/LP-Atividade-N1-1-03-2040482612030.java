import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Integer idade = null;
        System.out.println("Tentando realizar operação aritmética com Integer nulo...");
        try{
            int proximoAno = idade + 1;
        } catch(NullPointerException e) {
            System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null).");
            System.out.println("Detalhe de exceção: " + e);
            System.out.println(" ");
            //Leitura da nova idade
            System.out.print("Informe uma idade válida: ");
            int novaIdade = scanner.nextInt();
            System.out.println("Reatribuindo valor váido para a variável...");
            idade = novaIdade;
            int  proximoAno = idade + 1;
            System.out.println("Operação bem-sucedida! Idade atual: " + idade + "| Idade no próximo ano: " + proximoAno);
            scanner.close();
        }
    }
}
