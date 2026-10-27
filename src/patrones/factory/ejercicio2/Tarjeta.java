package ejercicio2;

public class Tarjeta implements Pago{

    @Override
    public void realizarPago() {
        System.out.println("Pagando con PayPal");
    }
    
}
