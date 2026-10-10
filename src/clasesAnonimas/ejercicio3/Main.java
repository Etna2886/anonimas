package ejercicio3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Pedido p = new Pedido(101, 11.11);
        AccionPedido mostrar = new AccionPedido() {
            @Override
            public void ejecutar() {
                System.out.println(String.format("Pedido numero %d con numero %f", p.getNumero(), p.getImporte()));
            }
        };
        procesarPedido(p, mostrar);

        AccionPedido email = new AccionPedido() {
            @Override
            public void ejecutar() {
                System.out.println(
                        String.format("Enviando email al usuario que ha echo el pedido numero %d", p.getNumero()));
            }
        };
        procesarPedido(p, email);

        AccionPedido factura = new AccionPedido() {
            @Override
            public void ejecutar() {
                System.out.println("Factura:");
                System.out.println("Fecha: 11/1/2020");
                System.out.println("Numero de pedido: " + p.getNumero());
                System.out.println("Importe total: " + p.getImporte());
            }
        };
        procesarPedido(p, factura);

        AccionPedido registrar = new AccionPedido() {
            @Override
            public void ejecutar() {
                try {
                    FileOutputStream fich = new FileOutputStream("pedidos.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fich);
                    oos.writeObject(p);
                    oos.close();
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        procesarPedido(p, registrar);
    }

    public static void procesarPedido(Pedido p, AccionPedido ap) {
        ap.ejecutar();
    }
}
