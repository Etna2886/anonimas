package ejercicio4;

public class Alumno {
	private String dni;
	private String nombre;
	private double nota;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

    @Override
    public String toString() {
        return "Alumno [dni=" + dni + ", nombre=" + nombre + ", nota=" + nota + "]";
    }
    
}
