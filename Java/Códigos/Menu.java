import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        var menu = "Escolha uma opção:\n" +
                      "1. BigMac\n" +
                      "2. Quarteirão\n" +
                      "3. MacChicken\n" +
                      "4. Cheddar\n" +
                      "5. Cheese burger";
        
        String input = JOptionPane.showInputDialog(menu);
        int opcao = Integer.parseInt(input);
                String lanche = determinarLanche(opcao);
        JOptionPane.showMessageDialog(null, lanche);
    }

    public static String determinarLanche(int opcao) {
        return switch (opcao) {
            case 1 -> "Você escolheu: BigMac";
            case 2 -> "Você escolheu: Quarteirão";
            case 3 -> "Você escolheu: MacChicken";
            case 4 -> "Você escolheu: Cheddar";
            case 5 -> "Você escolheu: Cheese burger";
            default -> "Opção inválida!";
        };
    }
}