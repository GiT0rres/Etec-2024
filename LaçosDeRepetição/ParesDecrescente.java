import java.util.Scanner;

public class ParesDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();
        
        System.out.print("Informe o valor final: ");
        int valorFinal = scanner.nextInt();
        
        System.out.println("Números pares entre " + valorInicial + " e " + valorFinal + " em ordem decrescente:");
        
        for (int i = Math.max(valorInicial, valorFinal); i >= Math.min(valorInicial, valorFinal); i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}