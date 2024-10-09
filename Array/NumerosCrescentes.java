public class NumerosCrescentes {
    public static void main(String[] args) {
        // Criar um array de inteiros com 50 elementos
        int[] numeros = new int[50];

        // Preencher o array com números de 1 a 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // Preenche o array com números crescentes
        }

        // Exibir os números armazenados no array
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
