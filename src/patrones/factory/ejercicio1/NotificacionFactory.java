package ejercicio1;

public class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo) {
        if (tipo.equalsIgnoreCase("SMS")) {
            return new Sms();
        }
        if (tipo.equalsIgnoreCase("Email")) {
            return new Email();
        }
        throw new IllegalArgumentException("Tipo desconocido");
    }
}
