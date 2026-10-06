package ejercico1;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio1 {

    public static void main(String[] args) {

        // 1.1
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer edad) {
                return edad >= 18;
            }
        };
        System.out.println(p.test(20));


        // 1.2
        Function<String, Integer> longitudTexto = new Function<String, Integer>() {
            @Override
            public Integer apply(String texto) {
                return texto.length();
            }
        };
        System.out.println(longitudTexto.apply("Hola mundo"));


        // 1.3
        Consumer<String> mostrarTexto = new Consumer<String>() {
            @Override
            public void accept(String texto) {
                System.out.println(texto);
            }
        };
        mostrarTexto.accept("Texto de prueba");
    }
}