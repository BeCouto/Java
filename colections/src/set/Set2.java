package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        //declaraçao de um set strings
        Set<String> lista = new LinkedHashSet<String>();
        lista.add("pão de forma");
        lista.add("ovos");

        lista.add("frutas");
        lista.add("frutas"); //não é uma duplicata pq ha´dois objestos strigs com conteudo igual

        String itamDaLista = "café";

        lista.add(itamDaLista);
        lista.add(itamDaLista); //isto é uma duplicata


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

