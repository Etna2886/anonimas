package ejercicio6;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");

        Predicate<String> p = (a) -> a.length() > 4;

        Consumer<String> c = (a) -> System.out.println(a.toUpperCase());

        for(String n : nombres){
            if(p.test(n)){
                c.accept(n);
            }
        }
    }
}
