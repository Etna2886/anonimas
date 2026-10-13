import java.util.function.Predicate;

public class Ejercicio6 {
    public static void main(String[] args) {
        Predicate<String> vacio = texto -> texto.isEmpty();

        Predicate<String> vacio2 = String::isEmpty;

        System.out.println(vacio.test(""));
        System.out.println(vacio2.test("asda"));
    }

}
