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
        System.out.println("[Museo] Registrada: " + o.toString());
    }

    public void mostrarInventario() {
        System.out.println("\n--- CATALOGO: " + nombreMuseo.toUpperCase() + " ---");
        for (Obra o : listaObras) {
            System.out.println(o.toString());
        }
    }
}
