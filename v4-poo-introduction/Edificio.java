public class Edificio {

    String nombre;
    int numeroDeDepartamentos;

    public Edificio(String nombreInicial, int departamentosIniciales) {
        nombre = nombreInicial;
        numeroDeDepartamentos = departamentosIniciales;
    }

    public void mostrarDatos() {
        System.out.println(
            "Soy un Edificio " +
                nombre +
                " y tengo " +
                numeroDeDepartamentos +
                " departamentos."
        );
    }
}
