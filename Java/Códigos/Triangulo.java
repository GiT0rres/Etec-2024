import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Digite o valor do lado A (em cm pfvr): ");
        double ladoA = Double.parseDouble(inputA);
        
        String inputB = JOptionPane.showInputDialog("Digite o valor do lado B (em cm pfvr): ");
        double ladoB = Double.parseDouble(inputB);
        
        String inputC = JOptionPane.showInputDialog("Digite o valor do lado C (em cm pfvr): ");
        double ladoC = Double.parseDouble(inputC);
                String resultado = verificarTriangulo(ladoA, ladoB, ladoC);
                JOptionPane.showMessageDialog(null, resultado);
    }

    public static String verificarTriangulo(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Os lados formam um triângulo equilátero.";
            } else if (a == b || a == c || b == c) {
                return "Os lados formam um triângulo isósceles.";
            } else {
                return "Os lados formam um triângulo escaleno.";
            }
        } else {
            return "Os valores fornecidos não formam um triângulo.";
        }
    }
}