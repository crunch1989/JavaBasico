
package clase2.tarea;

public class Libros implements LibroInterface{
    
    private String titulo;
    private String genero;
    private int costo;
    
    public Libros(String titu,String gene)
    {
        titulo=titu;
        genero=gene;
        costo=0;
    }
    public Libros()
    {
        
    }

    @Override
    public void Consulta() {
        System.out.println("Los libros pueden ser consultados durante un periodo de hasta 15 días ");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
