package ejercicio1;
public class Main {
    public static void main(String[] args) {
        Termometro t = new Termometro();
        Pantalla p = new Pantalla();
        Alarma a = new Alarma();
        t.suscribir(a);
        t.suscribir(p);
        t.cambioDeTemperatura(20);
        t.cambioDeTemperatura(40);
    }
}
