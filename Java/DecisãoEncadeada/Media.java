import javax.swing.JOptionPane;

public class Media{
    public static void main(String[] args) {
        String inputNota1 = JOptionPane.showInputDialog("Digite a 1º nota: ");
        double nota1 = Double.parseDouble(inputNota1);
        
        String inputNota2 = JOptionPane.showInputDialog("Digite a 2º nota: ");
        double nota2 = Double.parseDouble(inputNota2);
        
        String inputNota3 = JOptionPane.showInputDialog("Digite a 3º nota: ");
        double nota3 = Double.parseDouble(inputNota3);
        
        String inputNota4 = JOptionPane.showInputDialog("Digite 4º nota: ");
        double nota4 = Double.parseDouble(inputNota4);
        double media = calcularMedia(nota1, nota2, nota3, nota4);
                String conceito = determinarConceito(media);
                JOptionPane.showMessageDialog(null, "Sua média é: " + media + "\nConceito: " + conceito);
    }
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static String determinarConceito(double media) {
        if (media >= 9) {
            return "A - Parabéns! Você está aprovado.";
        } else if (media >= 7) {
            return "B - Parabéns! Você está aprovado";
        } else if (media >= 5) {
            return "C - Parabéns! Você está aprovado";
        } else if (media >= 2.5) {
            return "D - Sinto muito! Você foi reprovado";
        } else {
            return "E - Sinto muito! Você foi reprovado";
        }
    }
}