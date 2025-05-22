package classesabstrata;

public abstract class Veiculo {

    final int numeroRodasMinimo = 2;
    String placa;
    String chassi;

    abstract public String acelerar();

    public String frear() {
        return "Freando";
    }
}
