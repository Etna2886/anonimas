import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros =Arrays.asList(1,2,3,4,5,6);
        numeros.stream()
        .filter(n->n>2)
        .map(n->n*2)
        .peek(n->System.out.println("tras map: "+n))
        .sorted();
    }
}
/* Primero filtra los numeros y se queda con los numeros mas grandes que 2 luego duplica esos numeros, muestra los numeros duplicados y finalmente los ordena.*/