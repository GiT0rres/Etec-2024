import java.util.Arrays;

public class NomeCrescente {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Beatriz", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana", "Lucas"};
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem crescente: " + Arrays.toString(nomes));
    }
}