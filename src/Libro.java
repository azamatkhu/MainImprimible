public class Libro implements Imprimible {
    private String autor;
    private String titulo;

    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public void imprimir() {
        System.out.println("a = " + autor + ", titulo = " + titulo);
    }
}

