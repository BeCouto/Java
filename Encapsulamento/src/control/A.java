package control;

import model.B;
import model.F;
import view.C;

public class A {
    String aa1;
    private String aa2;
    public String aa3;
    protected String aa4;

    public void testeB() {
        B b = new B();
        //b.ba3
    }

    public void testeC() {
        C c = new C();
        //c.ca3
    }
    public void testeE() {
        E e = new E();
        //e.aa1
        //e.aa4
        //e.aa3

    }
    public void testeF() {
        F f = new F();
        // f.aa3
        // f.aa4 protected 
        //f.fa3

    }

}
