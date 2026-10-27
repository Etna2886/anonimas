package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Jugador j = new Jugador();
        Marcador m = new Marcador();
        Estadisticas e = new Estadisticas();
        j.suscribir(e);
        j.suscribir(m);
        j.suvirNivel(33);
    }
}
