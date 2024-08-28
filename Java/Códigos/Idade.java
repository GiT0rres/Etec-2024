import javax.swing.JOptionPane;

public class Idade {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a idade do nadador: ");
        int idade = Integer.parseInt(input);
        String categoria = determinarCategoria(idade);
        JOptionPane.showMessageDialog(null, "A categoria é: " + categoria);
    }

    public static String determinarCategoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Senior";
        } else {
            return "Idade inválida!";
        }
    }
}