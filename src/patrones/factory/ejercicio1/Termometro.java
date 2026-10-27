package ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Termometro {
    private List<Observador> observadores = new ArrayList<>();

    public void suscribir(Observador observador) {
        observadores.add(observador);
    }

    public void cambioDeTemperatura(int temperatura){
        for(Observador observer: observadores){
            observer.nuevaTemperatura(temperatura);
        }
    }

}
