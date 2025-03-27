public class Aluno {

    String matricula, nome, curso;

    public Aluno(String id, String name, String course) {
        this.matricula = id;
        this.nome = name;
        this.curso = course;


    }
    public void trocarDeCurdo(String novoCurso) {
        this.curso = novoCurso;
    }
    public void trocarDenome(String novoNome) {
        this.nome = novoNome;
    }
}
