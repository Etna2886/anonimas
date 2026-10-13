package methodReference;

import java.util.function.Function;

public class Ejercicio2 {
    public static void main(String[] args) {
        Function<String, String> mayusculas = texto -> texto.toUpperCase();
        Function<String, String> mayusculas2 = String::toUpperCase;

        String s1 =  mayusculas.apply("abvc");
        String s2 =  mayusculas2.apply("abasdvc");

        System.out.println(s1);
        System.out.println(s2);
    }
}
