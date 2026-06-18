public class MethodsParameters {

    //Esta seria nuetra maquina expendedora
    //Metodo que recibe dos numeros enteros(parametros)
    //y devuelve su suma
    public static int sumar(int a, int b) {
        //La maquina procesara los numeros y nos dara el resultado
        return a + b;
    }

    public static void main(String[] args) {
        //introducimos las monedas 5 y 3, como parametros
        int resultado = sumar(5, 3);
        //Mostramos el producto que nos da la maquina,
        //osea el resultado
        System.out.println("La suma es: " + resultado);
    }
}
