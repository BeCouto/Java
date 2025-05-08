package model;

import model.Pessoa;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(){
        super();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String telefone, String matricula) {
        super(nome, telefone);
        this.matricula = matricula;

    }

}