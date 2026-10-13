import java.util.Arrays;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList(
                "Ana",
                "Luis",
                "Pedro");

        nombres.stream()
                .filter(n -> n.length() > 4)
                .forEach(System.out::println);
    }
}
