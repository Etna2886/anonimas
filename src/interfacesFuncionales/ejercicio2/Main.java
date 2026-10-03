package interfacesFuncionales.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    // Método genérico que usa Combinador: no sabe qué operación se hará
    static <T, U, R> R aplicar(T a, U b, Combinador<T, U, R> operacion) {
        return operacion.combinar(a, b);
    }

    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Ana", 1200, true));
        pedidos.add(new Pedido(2, "Carlos", 350, false));
        pedidos.add(new Pedido(3, "Marta", 800, true));
        pedidos.add(new Pedido(4, "Luis", 1500, false));

        GestorPedidos gestor = new GestorPedidos();
        List<Pedido> caros = gestor.buscar(pedidos, new Predicate<Pedido>() {
            @Override
            public boolean test(Pedido p) {
                return p.getImporte() > 1000;
            }
        });

        List<Pedido> pendientes = gestor.buscar(pedidos, new Predicate<Pedido>() {
            @Override
            public boolean test(Pedido p) {
                return !p.isPagado();
            }
        });

        System.out.println("Pedidos > 1000 €:");
        for (Pedido p : caros) {
            System.out.println("  " + p.getNumero() + " - " + p.getCliente());
        }

        System.out.println("Pedidos sin pagar:");
        for (Pedido p : pendientes) {
            System.out.println("  " + p.getNumero() + " - " + p.getCliente());
        }

        Function<Pedido, String> aCsv = new Function<Pedido, String>() {
            @Override
            public String apply(Pedido p) {
                return p.getNumero() + ";" + p.getCliente() + ";" + p.getImporte() + ";" + p.isPagado();
            }
        };

        Function<Pedido, String> aTexto = new Function<Pedido, String>() {
            @Override
            public String apply(Pedido p) {
                return "Pedido " + p.getNumero() + " - Cliente: " + p.getCliente()
                        + " - Importe: " + p.getImporte() + " €";
            }
        };

        Pedido primero = pedidos.get(0);
        System.out.println(gestor.transformar(primero, aCsv));
        System.out.println(gestor.transformar(primero, aTexto));
        gestor.procesar(pedidos, new Consumer<Pedido>() {
            @Override
            public void accept(Pedido p) {
                System.out.println("Pedido " + p.getNumero() + " de " + p.getCliente());
            }
        });

        gestor.procesar(pedidos, new Consumer<Pedido>() {
            @Override
            public void accept(Pedido p) {
                if (!p.isPagado()) {
                    System.out.println("AVISO: el pedido " + p.getNumero()
                            + " de " + p.getCliente() + " está pendiente de pago");
                }
            }
        });

        Pedido pedido = pedidos.get(0);
        double descuento = 10;
        Combinador<Pedido, Double, Double> importeFinal = new Combinador<Pedido, Double, Double>() {
            @Override
            public Double combinar(Pedido p, Double desc) {
                return p.getImporte() * (1 - desc / 100);
            }
        };
        
        Combinador<Pedido, Double, String> resumen = new Combinador<Pedido, Double, String>() {
            @Override
            public String combinar(Pedido p, Double desc) {
                return "Pedido " + p.getNumero() + " con " + desc + "% de descuento";
            }
        };

        System.out.println("Importe con descuento: " + aplicar(pedido, descuento, importeFinal));
        System.out.println(aplicar(pedido, descuento, resumen));
    }
}
/*
 * 1. ¿Qué ventaja tiene que buscar() reciba un Predicate en lugar de tener un
 * método para cada condición?
 * Al no cambiar la clase GestorPedidos se puede cambiar las condiciones
 * directamente desde el main para que haga lo que tu le pidas,
 * ademas de eso evita reusar codigo ya que en este caso el buscar pedidos con
 * un precio mayor que x y buscar los pedidos no pagados
 * usan el mismo codigo menos un if y al hacerlo de esta manera no hace falta
 * hacer el mismo codigo 2 vezes para cambiar un simple if.
 */