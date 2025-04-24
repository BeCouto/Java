public class Aluno extends Pessoa {

    String matricula;

    public Aluno(){
    }

    public Aluno(String nome, String telefone, String matricula) {
        super(nome, telefone);
        this.matricula = matricula;

    }

}

