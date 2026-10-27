package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Pago p = PagoFactory.pagar("paypal");
        p.realizarPago();
        Pago p2 = PagoFactory.pagar("tarjeta");
        p2.realizarPago();
    }
}
