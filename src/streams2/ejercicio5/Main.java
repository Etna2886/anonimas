package streams2.ejercicio5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Path entrada = Path.of("reservas.txt");

        List<Reserva> reservas;
        try (Stream<String> lineas = Files.lines(entrada)) {
            reservas = lineas.map(Reserva::new).collect(Collectors.toList());
        }

        System.out.println("2. Reservas con importe > 300 €:");
        reservas.stream()
                .filter(r -> r.getImporte() > 300)
                .forEach(System.out::println);

        List<String> deBilbao = reservas.stream()
                .filter(r -> r.getCiudadOrigen().equals("Bilbao"))
                .map(Reserva::getCliente)
                .collect(Collectors.toList());
        System.out.println("\n3. Clientes de Bilbao: " + deBilbao);

        List<String> tresNoches = reservas.stream()
                .filter(r -> r.getNoches() >= 3)
                .map(Reserva::getCliente)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\n4. Clientes con >= 3 noches: " + tresNoches);

        double total = reservas.stream()
                .mapToDouble(Reserva::getImporte)
                .sum();
        System.out.println("\n5. Facturación total: " + total + " €");

        double media = reservas.stream()
                .mapToDouble(Reserva::getImporte)
                .average()
                .orElse(0);
        System.out.println("6. Importe medio: " + media + " €");

        Map<String, Long> porTipo = reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getTipoHabitacion, TreeMap::new, Collectors.counting()));
        System.out.println("\n7. Reservas por tipo de habitación: " + porTipo);

        Map<String, Double> porCiudad = reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getCiudadOrigen, TreeMap::new,
                        Collectors.summingDouble(Reserva::getImporte)));
        System.out.println("\n8. Facturación por ciudad: " + porCiudad);

        Reserva mayor = reservas.stream()
                .max(Comparator.comparingDouble(Reserva::getImporte))
                .orElseThrow();
        System.out.println("\n9. Reserva de mayor importe: " + mayor);

        long caras = reservas.stream()
                .filter(r -> r.getImporte() > 300)
                .count();
        double porcentaje = caras * 100.0 / reservas.size();
        System.out.println("\n10. Porcentaje de reservas > 300 €: " + porcentaje + " %");


        List<String> servicios = reservas.stream()
                .flatMap(r -> r.getServicios().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\n11. Servicios contratados: " + servicios);


        Map<String, Long> porServicio = reservas.stream()
                .flatMap(r -> r.getServicios().stream())
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));
        System.out.println("\n12. Reservas por servicio: " + porServicio);

        Map<Boolean, List<Reserva>> grupos = reservas.stream()
                .collect(Collectors.partitioningBy(r -> r.getImporte() > 300));
        System.out.println("\n13. Reservas > 300 €:");
        grupos.get(true).forEach(System.out::println);
        System.out.println("    Reservas <= 300 €:");
        grupos.get(false).forEach(System.out::println);

        System.out.println("\n14. Top 3 reservas:");
        reservas.stream()
                .sorted(Comparator.comparingDouble(Reserva::getImporte).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n15. peek():");
        reservas.stream()
                .peek(r -> System.out.println("   Antes del filtro:   " + r.getId()))
                .filter(r -> r.getImporte() > 300)
                .peek(r -> System.out.println("   Después del filtro: " + r.getId()))
                .count();


        try (Stream<String> lineas = Files.lines(entrada);
                BufferedWriter writer = Files.newBufferedWriter(Path.of("reservas_caras.txt"))) {
            lineas.map(Reserva::new)
                    .filter(r -> r.getImporte() > 300)
                    .forEach(r -> {
                        try {
                            writer.write(r.toString());
                            writer.newLine();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    });
        }
        System.out.println("\n16. Fichero reservas_caras.txt generado.");
    }

}
