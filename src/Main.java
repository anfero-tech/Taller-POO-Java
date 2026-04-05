import Televentas.*;
import Museo.*;

public class Main {
    public static void main(String[] args) {
        // Ejecución Televentas
        System.out.println(">>> EJECUTANDO MODULO TELEVENTAS <<<");
        Producto p1 = new Producto("TV01", "Laptop Gamer", 4500000, 5);
        Pedido ped = new Pedido(1001, "Andres Rodriguez");
        ped.agregarProducto(p1, 1);
        ped.generarFactura();

        // Ejecución Museo
        System.out.println("\n>>> EJECUTANDO MODULO MUSEO <<<");
        Catalogo miMuseo = new Catalogo("Museo de La Salle");
        miMuseo.registrarObra(new Obra("La Mona Lisa", "Da Vinci", 1503, "Pintura"));
        miMuseo.mostrarInventario();
    }
}