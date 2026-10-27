package ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Estadisticas implements Observador {

    @Override
    public void actualizarPuntos(int puntos) {
         try (FileWriter fw = new FileWriter("archivo.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            bw.write("Se han sumado " + puntos + " puntos");
            bw.newLine();
            
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el fichero: " + e.getMessage());
        }
    }
}
