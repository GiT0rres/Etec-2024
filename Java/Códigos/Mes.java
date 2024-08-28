import javax.swing.JOptionPane;

public class Mes {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número entre 1 e 12: ");
        int numeroMes = Integer.parseInt(input);
        String nomeMes = determinarMes(numeroMes);
                JOptionPane.showMessageDialog(null, nomeMes);
    }
    public static String determinarMes(int numeroMes) {
        return switch (numeroMes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Fala sério! Não banque de difícil. Digite um número entre 1 e 12.";
        };
    }
}