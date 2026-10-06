package lambdas.ejercicio2;

public class Main {
    public static void main(String[] args) {
        OperacionSuma o = (a,b) -> a + b;
        
        System.out.println(o.calcular(1, 2));
    }
}
