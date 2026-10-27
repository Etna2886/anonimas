package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private List<Observador> observadores = new ArrayList<>();

    public void suscribir(Observador observador) {
        observadores.add(observador);
    }

    public void suvirNivel(int puntos) {
        for(Observador o : observadores){
            o.actualizarPuntos(puntos);
        }
    }
}
