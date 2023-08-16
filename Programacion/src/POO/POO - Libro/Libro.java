public class Libro {
    // Los Atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor "Libro"
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para obtener el ISBN
    public String getISBN() {
        return ISBN;
    }

    // Método para establecer el ISBN
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Método para obtener el título
    public String getTitulo() {
        return titulo;
    }

    // Método para establecer el título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para obtener el autor
    public String getAutor() {
        return autor;
    }

    // Método para establecer el autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para obtener el número de páginas
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Método para establecer el número de páginas
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString para mostrar información del libro
    public String toString() {
        return "El libro con ISBN " + ISBN + " creado por " + autor + " tiene " + numeroPaginas + " páginas.";
    }
}

