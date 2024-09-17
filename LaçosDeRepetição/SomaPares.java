import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();
        
        System.out.print("Informe o valor final: ");
        int valorFinal = scanner.nextInt();
        
        int soma = 0;
        
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos números pares entre " + valorInicial + " e " + valorFinal + " é: " + soma);
        
        scanner.close();
    }
}