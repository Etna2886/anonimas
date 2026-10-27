package ejercicio1;
public class Pantalla implements Observador{
    
    @Override
    public void nuevaTemperatura(int temperatura) {
        System.out.println("Se ha cambiado la temperatura, la nueva temperatura es: " + temperatura);
    }

}
