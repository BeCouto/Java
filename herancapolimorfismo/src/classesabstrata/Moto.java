package classesabstrata;

public class Moto extends Veiculo {

    //implementaçao do metodo abstrato acelerar() definido na superclasse
    public String acelerar(){
        return "Acelerando Moto";
    }

     // Sobrescrita do metodo concreto frear() definido na superclasse
    @Override
    public String frear() {
        return super.frear();
    }
}
