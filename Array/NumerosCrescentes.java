public class NumerosCrescentes {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        // Preencher o array com números de 1 a 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; 
        }
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
