import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        String inputData1 = JOptionPane.showInputDialog("Digite a primeira data: ");
        String inputData2 = JOptionPane.showInputDialog("Digite a segunda data: ");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data1 = formato.parse(inputData1);
            Date data2 = formato.parse(inputData2);
                        String resultado;
            if (data1.before(data2)) {
                resultado = "Ordem crescente: " + formato.format(data1) + " , " + formato.format(data2);
            } else if (data1.after(data2)) {
                resultado = "Ordem crescente: " + formato.format(data2) + " , " + formato.format(data1);
            } else {
                resultado = "As datas são iguais: " + formato.format(data1);
            }
            
            JOptionPane.showMessageDialog(null, resultado);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido. Por favor, insira no formato dd/MM/yyyy.");
        }
    }
}
