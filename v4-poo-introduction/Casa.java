public class Casa {

    String color;
    int numeroDeVentanas;

    public Casa(String colorInicial, int ventanasIniciales) {
        color = colorInicial;
        numeroDeVentanas = ventanasIniciales;
    }

    public void mostrarDatos() {
        System.out.println(
            "Soy una casa de color " +
                color +
                " y tengo " +
                numeroDeVentanas +
                " ventanas."
        );
    }
}
