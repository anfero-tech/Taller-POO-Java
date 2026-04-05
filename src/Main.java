import Televentas.*;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("DS01", "Laptop Gamer", 4500000.0, 5);
        Producto p2 = new Producto("DS02", "Monitor 4K", 1800000.0, 8);
        Producto p3 = new Producto("DS03", "Mouse Optico", 85000.0, 20);

        
        Pedido miPedido = new Pedido(1001, "Andres Rodriguez");

        System.out.println("--- INICIANDO PROCESO DE VENTA ---");
        miPedido.agregarProducto(p1, 1);
        miPedido.agregarProducto(p3, 2);
        
    
        miPedido.agregarProducto(p2, 10); 

        miPedido.generarFactura();
    }
}