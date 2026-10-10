package lambdas.ejercicio5;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> MayorQue100 = numero -> numero > 100;

        System.out.println("¿Es 150 mayor que 100? " + MayorQue100.test(150));
        System.out.println("¿Es 50 mayor que 100? " + MayorQue100.test(50));
    }
}