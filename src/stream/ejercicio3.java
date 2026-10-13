import java.util.Arrays;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Pedro");

        nombres.stream()
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

    }
}
