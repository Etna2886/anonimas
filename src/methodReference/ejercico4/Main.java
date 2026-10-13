package ejercico4;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Operacion suma = (a, b) -> calculadora.sumar(a, b);
        Operacion suma2 = calculadora::sumar;

        System.out.println(suma.ejecutar(2, 3));
        System.out.println(suma2.ejecutar(3, 3));

    }
}
