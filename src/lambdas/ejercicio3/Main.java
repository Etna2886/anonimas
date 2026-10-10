package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;[cite: 1, 3]
        Operacion resta = (a, b) -> a - b;[cite: 1]
        Operacion multiplicacion = (a, b) -> a * b;[cite: 1]

        int num1 = 10;
        int num2 = 4;

        System.out.println("Suma: " + suma.calcular(num1, num2));
        System.out.println("Resta: " + resta.calcular(num1, num2));
        System.out.println("Multiplicación: " + multiplicacion.calcular(num1, num2));
    }
}