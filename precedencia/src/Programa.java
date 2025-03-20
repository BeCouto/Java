public class Programa {
    public static void main(String[] args) {

        String nome1 = "Maria";
        String nome2 = nome1;
        nome1 = "Jóse";

        float a = 5 * 4 / (float) 6 + 7;
        double b = 5 * 4 / 6 + 7;

        System.out.println(a);
        System.out.println(b);

        if(nome1.equals("Maria")){
            System.out.println("olá, Maria");
        } else {
            System.out.println("Seja, bem-vindo");
        }
    }
}

