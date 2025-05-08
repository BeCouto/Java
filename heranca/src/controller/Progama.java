package controller;

import model.Pessoa;
import model.Aluno;
import model.Monitor;
import model.Professor;

public class Progama {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setTelefone("123456789");
        System.out.println(pessoa1.getTelefone());
        pessoa1.mudarTelefone("87654321");
        System.out.println(pessoa1.getTelefone());

        Pessoa pessoa2 = new Pessoa("Miguel", "12316754614");
        System.out.println( pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());

        Pessoa pessoa3 = new Pessoa("Rafael");
        System.out.println("nome:" + pessoa3.getNome());



        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");
        aluno1.setTelefone("56274629");
        System.out.println(aluno1.getTelefone());
        aluno1.mudarTelefone("98478111");
        System.out.println(aluno1.getTelefone());

        Aluno aluno2 = new Aluno("Victor", "478324792", "32842479");
        System.out.println(aluno2.getTelefone());



        Professor professor1 = new Professor();
        professor1.setNome("Thiago");
        professor1.setTelefone("4353529725");
        professor1.setTitulacao("Doutor");
        //System.out.println("Titulacao: " + professor1.titulacao);
        //professor1.mudarTitulacao("Mestre");
        //System.out.println("Titulação:" + professor1.titulacao);

        Professor professor2 = new Professor("Leonardo", "4236742849" , "Mestre");


        Monitor monitor1 = new Monitor();
        monitor1.setNome("Pedro");
        monitor1.setTelefone("2165446184");
        monitor1.setBolsa(100.0);
        System.out.println(monitor1.getBolsa());

        Monitor monitor2 = new Monitor("Lucas", "25253325", "3267826478",100.0);
        System.out.println(monitor2.getBolsa());
        monitor2.setBolsa(20.0);
        System.out.println(monitor2.getBolsa());

    }
}
