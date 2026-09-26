package ejercicio4;

public class Main {
    public static void main(String[] args) {
        AlumnoRepository alumnos = new AlumnoRepository();
        Alumno alumno1 = new Alumno();
        alumno1.setDni("11111111A");
        alumno1.setNombre("Ana");
        alumno1.setNota(8.5);
        alumnos.guardar(alumno1);

        Alumno alumno2 = new Alumno();
        alumno2.setDni("22222222B");
        alumno2.setNombre("Luis");
        alumno2.setNota(7.0);
        alumnos.guardar(alumno2);

        Alumno alumno3 = new Alumno();
        alumno3.setDni("33333333C");
        alumno3.setNombre("Marta");
        alumno3.setNota(9.2);
        alumnos.guardar(alumno3);

        Alumno alumno4 = new Alumno();
        alumno4.setDni("44444444D");
        alumno4.setNombre("Pedro");
        alumno4.setNota(6.8);
        alumnos.guardar(alumno4);

        Alumno alumno5 = new Alumno();
        alumno5.setDni("55555555E");
        alumno5.setNombre("Sofía");
        alumno5.setNota(9.7);
        alumnos.guardar(alumno5);

        AccionAlumno mostrar = new AccionAlumno() {
            @Override
            public void ejecutar(Alumno alumno) {
                System.out.println(alumno);
            }
        };
        alumnos.buscarPorDni("55555555E", mostrar);

        AccionAlumno modificar = new AccionAlumno() {
            @Override 
            public void ejecutar(Alumno alumno){
                alumno.setNota(5);
            }
        };
        alumnos.buscarPorDni("44444444D", modificar);
        System.out.println(alumno4);

        AccionAlumno buscar = new AccionAlumno() {
             @Override 
            public void ejecutar(Alumno alumno){
                if(alumno.getNota()>9){
                    System.out.println("Felicidades tienes una calificación excelente");
                }
            }
        };
        alumnos.buscarPorDni("33333333C", buscar);
    }
}
