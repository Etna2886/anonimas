package ejercicio1;
public class Alarma implements Observador {

    @Override
    public void nuevaTemperatura(int temperatura) {
        System.out.println("Alarma: nueva temperatura: " + temperatura);
    }
}
