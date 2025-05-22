package interfaces;

public interface Veiculo {

    final int numerorodasMinimo = 2; //Atributos (costantes)
    public String acelerar();//Você pode, sim, ter métodos concretos em ‘interfaces’,
    // mas só com as palavras-chave ‘default’, static ou private, dependendo da versão do Java.

    public String frear();



}
