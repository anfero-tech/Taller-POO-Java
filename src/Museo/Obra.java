package Museo;

public class Obra {
    private String titulo;
    private String autor;
    private int anio;
    private String tipo;

    public Obra(String titulo, String autor, int anio, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Obra: %-20s | Autor: %-15s | Año: %d | Tipo: %s", 
                             titulo, autor, anio, tipo);
    }
}
