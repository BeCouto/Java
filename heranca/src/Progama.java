public class Progama {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "123456789";
        System.out.println("Telefone: " + pessoa1.telefone);
        pessoa1.mudarTelefone("87654321");
        System.out.println("Telefone:" + pessoa1.telefone);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "56274629";
        System.out.println("Telefone: " + aluno1.telefone);
        aluno1.mudarTelefone("98478111");
        System.out.println("Telefone:" + aluno1.telefone);


        Professor professor1 = new Professor();
        professor1.nome = "Thiago";
        professor1.telefone = "4353529725";
        professor1.titulacao = "Doutor";
        System.out.println("Titulacao: " + professor1.titulacao);
        professor1.mudarTitulacao("Mestre");
        System.out.println("Titulação:" + professor1.titulacao);

        Monitor monitor1 = new Monitor();
        monitor1.nome = "Pedro";
        monitor1.telefone = "2165446184";
        monitor1.bolsa = 100.0;
        System.out.println("Bolsa: " + monitor1.bolsa);

    }
}
