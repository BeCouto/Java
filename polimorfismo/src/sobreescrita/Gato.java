package sobreescrita;

public class Gato extends Animal {
    @Override
    void emitSom() {
        System.out.println("Miau");
    }
}
