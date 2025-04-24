public class Monitor extends Aluno {

    private double bolsa;

    public Monitor(){
    }

    public Monitor(String nome, String telefone, String matricula, double bolsa){
        super(nome, telefone , matricula);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}

