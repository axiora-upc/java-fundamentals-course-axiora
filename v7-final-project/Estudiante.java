public class Estudiante{

    // Variables (Sintaxis básica): atributos del estudiante
    // Encapsulación: son "private", nadie las toca directamente
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor: se ejecuta cuando creamos un objeto Estudiante
    public Estudiante (String nombre, int edad, double promedio){
        this.nombre= nombre;
        this.edad=edad;
        this.promedio=promedio;
    }
    
   // Getters: métodos para OBTENER los valores (encapsulación)
   public String getNombre() { 
       return nombre; 
       
   }
   
   public int getEdad(){
       return edad;
   }
   
   public double getPromedio(){
       return promedio;
   }

   // Setters: métodos para MODIFICAR los valores (encapsulación)
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
        
    }
    
    public void setEdad(int edad) {
        this.edad = edad; 
        
    }
    
    public void setPromedio(double promedio) { 
        this.promedio = promedio; 
        
    }
    
    
    // Método simple: muestra la info del estudiante
    public void mostrarInfo() {
        
        //Con esto podremos mostrar en pantalla.
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio);
    }
   
}
