public class Controller {
  private Model model;
  private View view;

  public Controller(Model model, View view) {
      this.model = model;
      this.view = view;
  }

  public void iniciar() {
      String unidadOrigen = view.obtenerUnidadOrigen();
      String unidadDestino = view.obtenerUnidadDestino();
      double cantidad = view.obtenerCantidad();

      try {
          double resultado = model.convertir(cantidad, unidadOrigen, unidadDestino);
          view.mostrarResultado(resultado, unidadDestino);
      } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
}