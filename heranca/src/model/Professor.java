package model;

public class Professor extends Pessoa {

    String titulacao;

    public Professor() {
    }

    public void mudarTitulacao(String novoTitulacao) {
        this.titulacao = novoTitulacao;
    }
    public Professor(String nome, String telefone, String titulacao) {
        super(nome, telefone);
        this.titulacao = titulacao;

    }
}
