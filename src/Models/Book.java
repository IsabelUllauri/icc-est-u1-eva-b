package Models;

public class Book {
    private String nombre;
    private int anio;

    public Book (String nombre, int anio){
        this.anio= anio;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Book [nombre=" + nombre + ", anio=" + anio + "]";
    }

    
    
}
