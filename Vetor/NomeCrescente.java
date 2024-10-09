import java.util.Arrays;
public class NomeCrescente {
    public static void main(String[] args) {
      
        String[] nomes = {
            "Carlos", "Ana", "Luan", "Beatriz", "Felipe", 
            "Kyara", "Joana", "Eduarda", "Mayra", 
            "Nayara", "Gustavo", "Helena", "Daniela", 
            "Isadora", "Otávio"};
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

