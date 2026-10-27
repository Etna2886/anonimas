package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = NotificacionFactory.crearNotificacion("email");
        notificacion.enviar();

    }
}
