//Paso 3: Importamos la libreria que nos permitira leer datos en consola
import java.util.Scanner;

//Paso 1: Crear mi public class MyClass
public class Main {

    //Paso 2: Crear mi metodo main
    
    public static void main(String[] args) {
        
        //Paso 4: Creamos nuestro scanner y lo asignamos a una variable
        Scanner leer = new Scanner(System.in);
        
        // Paso 5. Creamos el array de 3 estudiantes
        // Es como una hoja de asistencia con 3 filas vacías
        Estudiante[] registros = new Estudiante[3];

        // Paso 6. Bucle for: repetimos el proceso 3 veces
        // i empieza en 0 porque los arrays empiezan desde 0
        for (int i = 0; i < 3; i++) {

            System.out.println("--- Estudiante " + (i + 1) + " ---");

            // Paso 4. Pedimos los datos al usuario
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();

            System.out.print("Edad: ");
            int edad = leer.nextInt();
        
            while (edad < 12 || edad > 17) {
                System.out.print("La edad debe estar entre 12 y 17 años. Ingrese la edad: ");
                edad = leer.nextInt();
            }

            System.out.print("Promedio: ");
            double promedio=leer.nextDouble();
            
            while (promedio < 0 || promedio > 20) {
                
                System.out.print("El promedio debe estar entre 0 y 20. Ingrese el promedio: ");
                promedio = leer.nextDouble();
            }
            
            leer.nextLine(); // limpia el residuo de nextInt/nextDouble

            // Paso 7. Instanciamos el objeto y lo guardamos en el array
            registros[i] = new Estudiante(nombre, edad, promedio);
        }

        // Paso 6. Mostramos el registro completo con for-each
        System.out.println("\n===== REGISTRO DE ESTUDIANTES =====");
        for (int i = 0; i < 3; i++) {
             registros[i].mostrarInfo();
        }

        // Paso 7. Evaluamos el promedio con if-else
        System.out.println("\n===== MEJORES ESTUDIANTES =====");
        for (int i = 0; i < 3; i++) {
            if (registros[i].getPromedio() >= 14) {
                System.out.println(registros[i].getNombre() + " Aprobado");
            } else {
                System.out.println(registros[i].getNombre() + " Necesita mejorar");
            }
        }

        // Buena práctica: cerramos el Scanner al terminar
        leer.close();
    }
}