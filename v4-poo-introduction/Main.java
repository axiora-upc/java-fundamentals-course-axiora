public class Main {

    public static void main(String[] args) {
        Casa casaDeAlex = new Casa("Azul", 4);
        Casa casaDeSofia = new Casa("Verde", 6);

        Edificio torreCentral = new Edificio("Torre Alfa", 24);

        System.out.println("Inspeccionando las Casas:");
        casaDeAlex.mostrarDatos();
        casaDeSofia.mostrarDatos();

        System.out.println("Inspeccionando los Edificios:");
        torreCentral.mostrarDatos();
    }
}
