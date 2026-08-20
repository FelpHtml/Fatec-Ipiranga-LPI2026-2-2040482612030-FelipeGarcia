//*A estrutura do-while é a mais adequada, pois o sistema deve solicitar o PIN pelo menos uma vez
// após cada tentativa, o sistema verifica se o PIN informado está correto  */

import java.util.Scanner;
public class Main{
    public static final int PIN_CORRETO = 1234;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int pinDigitado;
        int tentativas = 0;

        do{
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = scanner.nextInt();
            tentativas++;
            if(pinDigitado != PIN_CORRETO){
                System.out.println("PIN incorreto. Tente novamente.");
            }
            }while(pinDigitado != PIN_CORRETO);
            System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativas(s).");

            scanner.close();

            }
        }
    
