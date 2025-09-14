//Ejercicio 3: Uso Incorrecto de static
//1. Intenta crear un método static en una clase que intente acceder y modificar un atributo no estático. Observa los errores de compilación y explica
//por qué suceden.
//2. Corrige el código para que sea correcto.
import java.util.Scanner;
public class UsoIncorrectoStatic {
    Scanner teclado = new Scanner(System.in);
    public String nombre = "Alejandro";
    
    //El siguiente metodo no puede ser estatico, ya que
    //esta haciendo referencia a un atributo de instancia 
    //conocido como "nombre". Nombre no pertenece directamente 
    //a la clase, nombre pertenece directamente a las instancias (objetos)
    //que se creen de esta clase.
    public static void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void pedirYCambiarNombre() {
        System.out.println("El nombre que se tiene actualmente es: " + this.nombre);
        System.out.print("Ingrese el nuevo nombre: ");
        //Creamos una variable local para guardar el nuevo nombre ingresado
        String nombreIngresado = teclado.nextLine();
            
        //Llamamos al metodo cambiarNombre para que así se guarden los cambios.
            this.cambiarNombre(nombreIngresado);
            
        //Imprimimos los cambios
        System.out.println("Este es el nuevo valor que se le ha dado a la variable nombre: " + this.nombre);
    }
    
}