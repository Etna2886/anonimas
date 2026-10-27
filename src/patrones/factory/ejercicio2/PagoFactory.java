package ejercicio2;

public class PagoFactory {
    public static Pago pagar(String tipo) {
        if (tipo.equalsIgnoreCase("Paypal")) {
            return new PayPal();
        }
        if (tipo.equalsIgnoreCase("Tarjeta")) {
            return new Tarjeta();
        }
        throw new IllegalArgumentException("Tipo desconocido");
    }
}
