import java.util.Arrays;
import java.util.Collections;

public class NumerosDecrescentes {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Gerando números aleatórios
        }
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Números em ordem decrescente: " + Arrays.toString(numeros));
    }
}