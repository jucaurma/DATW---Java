public class Model {
  public double convertir(double cantidad, String unidadOrigen, String unidadDestino) {
      if (unidadOrigen.equals("cm") && unidadDestino.equals("in")) {
          return cantidad / 2.54;
      } else if (unidadOrigen.equals("in") && unidadDestino.equals("cm")) {
          return cantidad * 2.54;
      } else {
          throw new IllegalArgumentException("Unidades de medida no soportadas");
      }
  }
}