//Importamos la clase Scanner para poder 
//leer la entrada del usuario
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        //Creamos un objeto Scanner para leer
        //la información ingresada por el usuario, como 
        //la ranura donde se introduce la "moneda".
        Scanner entrada = new Scanner(System.in);

        //Mostramos una pregunta para indicarle al usuario
        //que información debe ingresar.
        System.out.println("¿Cómo te llamas?");

        //Almacenamos la respuesta en la variable "nombre", 
        //como si la máquina guardara la moneda temporalmente.
        String nombre = entrada.nextLine();

        //Una vez que la maquina lo procesa, nos da el producto.
        //En este caso sera un saludo con el nombre ingresado
        System.out.println("Hola " + nombre);

        //Cerramos el Scanner porque ya no necesitamos
        //seguir leyendo datos del usuario
        entrada.close();
    }
}