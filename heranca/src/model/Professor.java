package model;

public class Professor extends Pessoa {

    private String titulacao;

    public Professor() {
        super();
    }

    public void mudarTitulacao(String novoTitulacao) {
        this.titulacao = novoTitulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Professor(String nome, String telefone, String titulacao) {
        super(nome, telefone);
        this.titulacao = titulacao;

    }
}
