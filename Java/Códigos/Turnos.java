import javax.swing.JOptionPane;

public class Turnos {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Hora de início do seu turno (de 0 a 23 pfvr): ");
        int hora = Integer.parseInt(input);
                String turno = determinarTurno(hora);
       
        JOptionPane.showMessageDialog(null, "O turno é: " + turno);
    }
    public static String determinarTurno(int hora) {
        if (hora >= 5 && hora < 13) {
            return "Manhã";
        } else if (hora >= 13 && hora < 21) {
            return "Tarde";
        } else {
            return "Noite";
        }
    }
}