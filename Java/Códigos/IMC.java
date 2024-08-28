import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        String inputPeso = JOptionPane.showInputDialog("Digite seu peso em kg: ");
        double peso = Double.parseDouble(inputPeso);
        String inputAltura = JOptionPane.showInputDialog("Digite sua altura em metros: ");
        double altura = Double.parseDouble(inputAltura);

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f%nClassificação: %s", imc, classificacao));
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18) {
            return "Você está desnutrido";
        } else if (imc >= 18 && imc <= 24.9) {
            return "Você está saudável";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Você está sobrepeso";
        } else {
            return "Você está obeso";
        }
    }
}
