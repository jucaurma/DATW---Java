package Ejemplosw3;

public class MetodoIfElse {
  // Crea un método checkAge con una variable de tipo int llamada age
  static void checkAge(int age) {
    if(age < 18) {
      System.out.println("Acceso denegado. Eres menor de edad.");
    } else {
      System.out.println("Acceso permitido. Eres mayor de edad.");
    }

  }



  public static void main(String[] args) {
    checkAge(17);
  }
}
