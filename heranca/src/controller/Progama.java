package controller;

import model.Pessoa;

public class Progama {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "123456789";
        System.out.println("Telefone: " + pessoa1.telefone);
        pessoa1.mudarTelefone("87654321");
        System.out.println("Telefone:" + pessoa1.telefone);

        Pessoa pessoa2 = new Pessoa("Miguel", "12316754614");
        System.out.println("Nome:" + pessoa2.nome);
        System.out.println("Telefone:" + pessoa2.telefone);

        Pessoa pessoa3 = new Pessoa("Rafael");
        System.out.println("nome:" + pessoa3.nome);



        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "56274629";
        System.out.println("Telefone: " + aluno1.telefone);
        aluno1.mudarTelefone("98478111");
        System.out.println("Telefone:" + aluno1.telefone);

        Aluno aluno2 = new Aluno("Victor", "478324792", "32842479");
        System.out.println("Nome:" + aluno2.nome);



        Professor professor1 = new Professor();
        professor1.nome = "Thiago";
        professor1.telefone = "4353529725";
        professor1.titulacao = "Doutor";
        //System.out.println("Titulacao: " + professor1.titulacao);
        //professor1.mudarTitulacao("Mestre");
        //System.out.println("Titulação:" + professor1.titulacao);

        Professor professor2 = new Professor("Leonardo", "4236742849" , "Mestre");
        System.out.println("Nome:" + professor2.nome);



        Monitor monitor1 = new Monitor();
        monitor1.nome = "Pedro";
        monitor1.telefone = "2165446184";
        monitor1.setBolsa(100.0);
        System.out.println("Bolsa: " + monitor1.getBolsa());

        Monitor monitor2 = new Monitor("Lucas", "25253325", "3267826478",100.0);
        System.out.println(monitor2.getBolsa());
        monitor2.setBolsa(20.0);
        System.out.println(monitor2.getBolsa());


    }
}
