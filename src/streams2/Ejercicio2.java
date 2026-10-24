package streams2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> n1 = new ArrayList<>(Arrays.asList(3, 8, 15, 22, 7, 10, 4, 19));

        ArrayList<Integer> n2 = n1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Original: " + n1); 
        System.out.println("Nueva:    " + n2); 
    }
}
