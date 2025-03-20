import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        int IdadeDefinitiva = Integer.parseInt(idade);


        if (IdadeDefinitiva >= 18) {
            System.out.println("Você está habilitado para começar o curso");
            JOptionPane.showInputDialog(null, "você está habilitado: ");
        }
        System.out.println(nome);
    }
}