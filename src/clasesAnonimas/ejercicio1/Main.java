package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Disco> aDiscos = new ArrayList<>();
        aDiscos.add(new Disco("nombreAAAAAAAA", "1"));
        aDiscos.add(new Disco("nombreBB", "123"));
        Collections.sort(aDiscos);
        System.out.println(aDiscos.get(0));
        System.out.println(aDiscos.get(1));
        Comparator<Disco> comparador  =new Comparator<Disco>(){
            @Override 
            public int compare(Disco d1, Disco d2){
                return d1.getGrupo().length() - d2.getGrupo().length();
            }
        };
        Collections.sort(aDiscos, comparador);
        System.out.println("--------------------------------------");
        System.out.println(aDiscos.get(0));
        System.out.println(aDiscos.get(1));
    }

}
