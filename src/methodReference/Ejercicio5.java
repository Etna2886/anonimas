import java.util.function.Function;

public class Ejercicio5 {
    public static void main(String[] args) {
        Function<String, Integer> longitud = String::length;

        Function<String, Integer> longitud2 = n -> n.length();

        int numero1 = longitud.apply("1e2e3e");
        int numero2 = longitud2.apply("456aaede");

        System.out.println("longitud: " + numero1);
        System.out.println("longitud2: " + numero2);

    }
}
