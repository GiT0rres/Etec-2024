import java.util.Arrays;
import java.util.Collections;
public class NomesDecrescentes {
    public static void main(String[] args) {
        // Criação do vetor com 15 nomes
        String[] nomes = {
          "Carlos", "Ana", "Luan", "Beatriz", "Felipe", 
            "Kyara", "Joana", "Eduarda", "Mayra", 
            "Nayara", "Gustavo", "Helena", "Daniela", 
            "Isadora", "Otávio"};
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}