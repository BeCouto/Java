package sobreescrita;

public class Cachorro extends Animal {
    @Override
    void emitSom() {
        System.out.println("Au au");
    }
}
