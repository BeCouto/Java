package control;

import model.Curso;
import model.Disciplina;

public class Programa {

    public static void main(String[] args) {


        Curso curso1 = new Curso("CD001", "Ciência de Dados");
        Curso curso2 = new Curso("ENGSOFT002", "Engenharia de Software");

        Disciplina poo = new Disciplina("IA001", "Inteligência Artificial", 80, curso1);
        Disciplina engDados = new Disciplina("BD001", "Banco de Dados para CD", 60, curso1);


        curso1.addDisciplina(poo);
        curso1.addDisciplina(engDados);

        curso2.addDisciplina(poo);
        curso2.addDisciplina(engDados);


        System.out.println("Curso: " + curso1.getNome() + " (Código: " + curso1.getCodigo() + ")");
        System.out.println("Disciplinas do curso de " + curso1.getNome() + ":");
        for (Disciplina disc : curso1.getDisciplinas()) {
            System.out.println("- " + disc.getNome() + " (CH: " + disc.getCargaHoraria() + ")");
        }

        System.out.println("\nCurso: " + curso2.getNome() + " (Código: " + curso2.getCodigo() + ")");
        System.out.println("Disciplinas do curso de " + curso2.getNome() + ":");
        for (Disciplina disc : curso2.getDisciplinas()) {
            System.out.println("- " + disc.getNome() + " (CH: " + disc.getCargaHoraria() + ")");
        }

        Disciplina eticaProfissional = new Disciplina("ETI001", "Ética Profissional em TI", 40, curso1);
        Disciplina governancaTI = new Disciplina("GOV002", "Governança de TI", 60, curso1);

        curso1.addDisciplina(eticaProfissional);
        curso1.addDisciplina(governancaTI);

        System.out.println("\nCurso: " + curso1.getNome() + " (Código: " + curso1.getCodigo() + ")");
        System.out.println("Disciplinas do curso de " + curso1.getNome() + ":");
        for (Disciplina disc : curso1.getDisciplinas()) {
            System.out.println("- " + disc.getNome() + " (CH: " + disc.getCargaHoraria() + ")");
        }

    }
}