
// Tipos de Datos Primitivos

public class TiposPrimitivos {
  public static void main(String args[]) {

    // ── ENTEROS ──────────────────────────────
    byte  b  = 100;            // 8 bits 
    short s  = 30000;          // 16 bits 
    int   i  = 2_000_000;      // 32 bits 
    long  l  = 9_000_000_000L; // 64 bits → requiere 'L'

    // ── DECIMALES ────────────────────────────
    float  f = 3.14f;          // 32 bits → requiere 'f'
    double d = 3.141592653;    // 64 bits

    // ── CARÁCTER ─────────────────────────────
    char c = 'A';              // 16 bits → un solo carácter

    // ── LÓGICO ───────────────────────────────
    boolean verdadero = true;     // solo true o false

    System.out.println("byte:    " + b);
    System.out.println("short:   " + s);
    System.out.println("int:     " + i);
    System.out.println("long:    " + l);
    System.out.println("float:   " + f);
    System.out.println("double:  " + d);
    System.out.println("char:    " + c);
    System.out.println("boolean: " + verdadero);
  }
}
