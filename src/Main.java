import Televentas.*;
import Museo.*;

public class Main {
    public static void main(String[] args) {
        // --- TELEVENTAS ---
        Pedido ped = new Pedido(1001, "Andres Rodriguez");
        ped.agregarProducto(new Producto("TV01", "Laptop", 3500, 5), 1);
        ped.generarFactura();

        // --- MUSEO ---
        Catalogo museo = new Catalogo("Museo La Salle");
        museo.registrarObra(new Obra("Mona Lisa", "Da Vinci", 1503, "Pintura"));
        museo.registrarObra(new Obra("La Ultima Cena", "Da Vinci", 1495, "Pintura"));
        
        museo.mostrarCatalogoCompleto();
        
        // Probando la lógica de búsqueda (Trazabilidad técnica)
        museo.buscarPorAutor("Da Vinci");
    }
}