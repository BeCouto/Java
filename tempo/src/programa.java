import javax.swing.*;

public class programa {
    public static void main(String[] args) {

        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Coloque seu tempo em (s): "));
        int hora = tempo/3600;
        int minuto = (tempo % 3600) / 60;
        int segundo = tempo % 60;

        JOptionPane.showMessageDialog(null, "Seu tempo é: " + hora + " hora(s), " + minuto + " minuto(s), " + segundo + " segundo(s).");
    }
}
