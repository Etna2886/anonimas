package streams2.ejercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reserva {
    private int id;
    private String cliente;
    private String ciudadOrigen;
    private String tipoHabitacion;
    private int noches;
    private double precioNoche;
    private List<String> servicios;

    // Construye la reserva a partir de una línea del fichero
    public Reserva(String linea) {
        String[] campos = linea.split(";");
        this.id = Integer.parseInt(campos[0]);
        this.cliente = campos[1];
        this.ciudadOrigen = campos[2];
        this.tipoHabitacion = campos[3];
        this.noches = Integer.parseInt(campos[4]);
        this.precioNoche = Double.parseDouble(campos[5]);
        this.servicios = Arrays.stream(campos[6].split(","))
                .filter(s -> !s.equals("ninguno"))
                .collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public int getNoches() {
        return noches;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public double getImporte() {
        return noches * precioNoche;
    }

    @Override
    public String toString() {
        String serv = servicios.isEmpty() ? "ninguno" : String.join(",", servicios);
        return id + ";" + cliente + ";" + ciudadOrigen + ";" + tipoHabitacion + ";"
                + noches + ";" + String.format(java.util.Locale.US, "%.2f", precioNoche) + ";" + serv;
    }
}
