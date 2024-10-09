import java.util.Arrays;

public class NumerosCrescentes {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Gerando números aleatórios
        }
        Arrays.sort(numeros);
        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
    }
}