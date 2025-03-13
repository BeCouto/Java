import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        int idade;
        float peso;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade ?");
        idade = teclado.nextInt();
        System.out.println("Qual é seu peso ?");
        peso = teclado.nextFloat();
        System.out.println("idade: " + idade + "\n" + "peso: " + peso);
    }
}