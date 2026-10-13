package ejercicio7;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> comprobar = numero -> Utilidades.esPar(numero);
        Predicate<Integer> comprobar2 = Utilidades::esPar;

        System.out.println(comprobar.test(2));
        System.out.println(comprobar2.test(3));  
    }
}
