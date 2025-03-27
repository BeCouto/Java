public class Programa {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("01","João", "CDIA");
        Aluno aluno2 = new Aluno("02","Vanessa", "ADS");
        //aluno2.trocarDeCurdo("ES");

        //System.out.println(aluno1.nome);
        //System.out.println(aluno2.nome);

        System.out.println(aluno2.curso);
        System.out.println(aluno2.nome);

        aluno2.trocarDeCurdo("ES");
        aluno2.trocarDenome("Leticia");

        System.out.println(aluno2.curso);
        System.out.println(aluno2.nome);

    }
}
