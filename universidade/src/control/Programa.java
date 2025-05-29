package control;

import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {

    public static void main(String[] args) {

        Disciplina poo = new Disciplina("IBM0513", "Programacao 00", 80);
        Disciplina engDados = new Disciplina("IBM1234", "Engenharia de Dados", 80);
        Professor profAnderson = new Professor("321", "Anderson Souza", "Metre");
        Professor profthiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profTaita = new Professor("001", "Talita vieira", "doutora");
        Turma pooSemProf = new Turma("CDIA001", "quinta-feira", "M1 a M4", "302", poo);
        Turma pooThiago = new Turma("CDIA001", "quarta-feira", "T1 a T4", "302", profthiago, poo);
        Turma engDadosanderson = new Turma("CDIA003", "Terça-feira", "MI a M4", "209", profAnderson, engDados);

        pooSemProf.setProfessor(profTaita);
        profthiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosanderson);
        profTaita.addTurma(pooSemProf);

        System.out.println(pooThiago.getProfessor().getNome());

        for (Turma turma : profthiago.getTurmas()) {
            System.out.println(turma.getDisciplina().getNome());
        }

         for (Turma turma :poo.getTurmas()) {
             System.out.println(turma.getProfessor().getNome());
         }
    }
}
