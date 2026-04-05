package Museo;
import java.util.ArrayList;

public class Catalogo {
    private String nombreMuseo;
    private ArrayList<Obra> listaObras;

    public Catalogo(String nombre) {
        this.nombreMuseo = nombre;
        this.listaObras = new ArrayList<>();
    }

    public void registrarObra(Obra o) {
        this.listaObras.add(o);
    }

    // EL PLUS: Buscar obras por autor (Lógica de filtrado)
    public void buscarPorAutor(String autorBusqueda) {
        System.out.println("\nResultados para: " + autorBusqueda);
        for (Obra o : listaObras) {
            if (o.getAutor().equalsIgnoreCase(autorBusqueda)) {
                System.out.println("-> " + o.getTitulo());
            }
        }
    }

    public void mostrarCatalogoCompleto() {
        System.out.println("\n======= " + nombreMuseo.toUpperCase() + " =======");
        for (Obra o : listaObras) {
            System.out.println(o.toString());
        }
    }
}
