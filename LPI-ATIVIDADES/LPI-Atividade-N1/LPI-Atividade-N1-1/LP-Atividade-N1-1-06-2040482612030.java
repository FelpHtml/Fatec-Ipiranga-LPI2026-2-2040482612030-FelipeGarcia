import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do usuário: ");
        String texto = scanner.nextLine();

        //O && possui curto-circuito:
        //se texto == null for false, texto.length() não será executado.
        //Com o operador & simples, as duas condições seriam avaliadas.
        //Se texto fosse null, exto.length() causaria uma NullPointerException.
        if(texto != null && texto.length() > 0) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio");
        }
    scanner.close();
}
}