package ejercicio1;

public class Email implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviando email");
    }
}
