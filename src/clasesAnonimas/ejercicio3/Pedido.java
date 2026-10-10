package ejercicio3;

import java.io.Serializable;

public class Pedido implements Serializable {
        private int numero;
        private double importe;

        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public double getImporte() {
            return importe;
        }
        public void setImporte(double importe) {
            this.importe = importe;
        }
        public Pedido(int numero, double importe) {
            this.numero = numero;
            this.importe = importe;
        }

        
        
}
