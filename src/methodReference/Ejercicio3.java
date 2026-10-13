package methodReference;

import java.util.function.Consumer;

public class Ejercicio3 {
    public static void main(String[] args) {
        Consumer<String> imprimir = System.out::println;
        Consumer<String> imprimir2 = a -> System.out.println(a);

        imprimir.accept("a");
        imprimir2.accept("b");

    }
}
