import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Leitura do valor para comparação de primitivos
        System.out.print("Valor para comparação de primitivos: ");
        int valorPrimitivo = scanner.nextInt();
        //Leitura do valor para comparação de objetos
        System.out.print("Valor para comparação de objetos (new Integer): ");
        int valorObjeto = scanner.nextInt();
        //Leitura do valor dentro do Integer Cache
        System.out.print("Valor dentro do Integer Cache (-128 a 127): ");
        int valorCache = scanner.nextInt();
        //Leitura do valor fora do Integer Cache
        System.out.print("Valor fora do Integer Cache: ");
        int valorForaCache = scanner.nextInt();

        //Comparação do primitivo Int
        System.out.println("--- Comparação de Primitivos (int) ---");
        int aPrimitivo = valorPrimitivo;
        int bPrimitivo = valorPrimitivo;
        System.out.println("aPrimitivo == bPrimitivo: " + (aPrimitivo == bPrimitivo));
        System.out.println(" ");
        //Comparação de dois objetos Integer
        System.out.println("--- Comparação de Objetos via 'new Integer()' ---");
        Integer aObjeto = new Integer(valorObjeto);
        Integer bObjeto = new Integer(valorObjeto);
        System.out.println("aObejto == bObjeto (Identidade): " + (aObjeto == bObjeto));
        System.out.println("aObjeto.equals(bOjeto) (Valor): " + aObjeto.equals(bObjeto));
        System.out.println(" ");
        //Integer Cache
        System.out.println("--- Comparação com Autoboxing e Integer Cache ---");
        Integer xCache = valorCache;
        Integer yCache = valorCache;
        System.out.println("Dentro do Cache (" + valorCache + ") -> xCache == yCache: " + (xCache == yCache));
        //Fora do Integer Cache
        Integer xForaCache = valorForaCache;
        Integer yForaCache = valorForaCache;
        System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache == yForaCache: " + (xForaCache == yForaCache));
        System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache.equals(yforaCache): " + xForaCache.equals(yForaCache));

        scanner.close();
    }
}