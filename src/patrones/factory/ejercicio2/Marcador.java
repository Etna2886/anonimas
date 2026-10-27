package ejercicio2;

public class Marcador implements Observador {

    @Override
    public void actualizarPuntos(int puntos) {
        System.out.println("Puntuacion actual es de: " + puntos);
    }
    
}
