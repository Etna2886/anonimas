package ejercicio4;

import java.util.ArrayList;

public class AlumnoRepository {
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    void guardar(Alumno a){
        alumnos.add(a);
    }

    void buscarPorDni(String dni, AccionAlumno ac){
        boolean encontrado = false;
        for (Alumno a : alumnos) {
            if(a.getDni().equalsIgnoreCase(dni)){
                ac.ejecutar(a);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No existe el alumno que estas buscando.");
        }
    }
}
