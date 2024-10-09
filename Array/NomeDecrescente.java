
import java.util.Arrays;
import java.util.Collections;

public class NomeDecrescente  {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Beatriz", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana", "Lucas", "Mariana", "Nicolas", "Olivia", "Pedro", "Quintino", "Rafael", "Sofia", "Thiago", "Ursula", "Vinicius"};
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente: " + Arrays.toString(nomes));
    }
}