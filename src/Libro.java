public class Libro {
  // Atributos de la clase
  private String titulo;
  private String autor;
  private int anoPublicacion;

  // Constructor para inicializar los atributos
  public Libro(String titulo, String autor, int anoPublicacion) {
      this.titulo = titulo;
      this.autor = autor;
      this.anoPublicacion = anoPublicacion;
  }

  // Método para mostrar los detalles del libro
  public void mostrarDetalles() {
      System.out.println("Título: " + this.titulo);
      System.out.println("Autor: " + this.autor);
      System.out.println("Año de Publicación: " + this.anoPublicacion);
  }

  // Métodos getters y setters (opcional)
  public String getTitulo() {
      return titulo;
  }

  public void setTitulo(String titulo) {
      this.titulo = titulo;
  }

  public String getAutor() {
      return autor;
  }

  public void setAutor(String autor) {
      this.autor = autor;
  }

  public int getAnoPublicacion() {
      return anoPublicacion;
  }

  public void setAnoPublicacion(int anoPublicacion) {
      this.anoPublicacion = anoPublicacion;
  }

  // Método principal para probar la clase
  public static void main(String[] args) {
      // Crear una instancia de la clase Libro
      Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

      // Mostrar los detalles del libro
      libro.mostrarDetalles();
  }
}
