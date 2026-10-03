package interfacesFuncionales.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GestorPedidos {

    public List<Pedido> buscar(List<Pedido> pedidos, Predicate<Pedido> condicion) {
        List<Pedido> resultado = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (condicion.test(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public String transformar(Pedido pedido, Function<Pedido, String> transformacion) {
        return transformacion.apply(pedido);
    }

    public void procesar(List<Pedido> pedidos, Consumer<Pedido> accion) {
        for (Pedido p : pedidos) {
            accion.accept(p);
        }
    }
}