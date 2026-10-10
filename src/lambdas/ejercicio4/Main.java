package lambdas.ejercicio4;

public class Main {

    static int operar(int a, int b, Operacion operacion) {
        return operacion.calcular(a, b);
    }

    public static void main(String[] args) {
        int resultadoSuma = operar(10, 4, (a, b) -> a + b);
        int resultadoMultiplicacion = operar(10, 4, (a, b) -> a * b);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}