package classesabstrata;

public class Carro extends Veiculo {

    public String acelerar() {
        return "Acelerando o Carro";
    }

    @Override
    public String frear() {
        return  "Freando o carro";
    }
}
