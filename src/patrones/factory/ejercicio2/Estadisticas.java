package ejercicio2;

public class Estadisticas implements Observador {

    @Override
    public void actualizarPuntos(int puntos) {
        System.out.println("Puntos totales: " + puntos);
    }
}
