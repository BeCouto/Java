package control;

import model.B;
import view.C;

//Se uma Classe Java fizer referência a outra classe que
//esteja em outro pacote, ela deverá importar
public class D {

    public void testeA() {
        A a = new A();
        //a.aa3
        //a.aa1
        //a.aa4
    }


    public void testeB() {
        B b = new B();
       // b.ba3
    }

    public void testeC() {
        C c = new C();
        //c.ca3
    }

}
