import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .forEach(System.out::println);

        System.out.println("------------");

        numeros.stream()
                .map(n -> n * 2)
                .filter(n -> n > 3)
                .forEach(System.out::println);
    }
}
