package Museo;

public class Obra {
    private String titulo;
    private String autor;
    private int anio;
    private String tipo;

    public Obra(String titulo, String autor, int anio, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        setAnio(anio); // Validación
        this.tipo = tipo;
    }

    public void setAnio(int anio) {
        if (anio <= 2026) { this.anio = anio; }
        else { System.out.println("Error: Año no válido."); }
    }

    public String getAutor() { return autor; }
    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return String.format("[%s] %-15s - %-15s (%d)", tipo, titulo, autor, anio);
    }
}
