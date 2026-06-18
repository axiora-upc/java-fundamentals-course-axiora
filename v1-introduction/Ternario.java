public class Ternario {
  public static void main(String[] args) {
    int edad = 16;

    // condicion ? valorSiTrue : valorSiFalse
    
    String resultado = (edad >= 18)
        ? "Mayor de edad"
        : "Menor de edad";

    System.out.println(resultado); // Mayor de edad

    // Equivale a:
    // if (edad >= 18) { resultado = "Mayor de edad"; }
    // else            { resultado = "Menor de edad"; }
    
  }
}