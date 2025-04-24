public class Pessoa {

     String nome;
     String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;

    }
    public void mudarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

}
