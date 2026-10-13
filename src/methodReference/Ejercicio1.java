package methodReference;

import java.util.function.Function;

public class Ejercicio1 {
    public static void main(String[] args) {
        Function<String, Integer> convertir = Integer::parseInt;
        Function<String, Integer> convertir2 = n -> Integer.parseInt(n);

        int numero1 = convertir.apply("123");
        int numero2 = convertir2.apply("456");

        System.out.println("convertir: " + ((Object) numero1).getClass().getSimpleName());
        System.out.println("convertir2: " + ((Object) numero2).getClass().getSimpleName());
    }
}
