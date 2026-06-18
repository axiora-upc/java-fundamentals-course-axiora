public class IncrementoDecremento {
  public static void main(String[] args) {
    int n = 5;

    System.out.println("Antes: " + n++); // 5 → imprime ANTES de sumar
    System.out.println("Ahora: " + n);   // 6 → ahora n vale 6
    System.out.println("Después: " + ++n); // 7 → suma ANTES de imprimir

    System.out.println("Antes: " + n--); // 7 → imprime ANTES de restar
    System.out.println("Ahora: " + n);   // 6 → ahora n vale 6
    System.out.println("Después: " + --n); // 5 → resta ANTES de imprimir
  }
}