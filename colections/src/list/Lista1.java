package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista1 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("pão de forma");
        lista.add("ovos");

        lista.add("frutas");
        lista.add("frutas"); //não é uma duplicata

        String itamDaLista = "café";

        lista.add(itamDaLista);
        lista.add(itamDaLista); //isto é uma duplicata


        //interaçao usado for tradicional
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }


        //interaçao usando for each(MELHOR METODO)
        for(String item : lista) {
            System.out.println(item);
        }

        //interaçao usando for each com expressao lambda
        lista.forEach(item -> System.out.println(item));

        //iteraçao usando um Iterator
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

//https://docs.oracle.com/javase/8/docs/api/ (MELHOR API JAVA)
