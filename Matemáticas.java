//Ejercicio 2: Clase Matematicas con Métodos static
//1. Define una clase Matematicas que tenga métodos static para realizar las operaciones básicas (suma, resta, multiplicación, división).
//2. Crea una clase de prueba que llame a estos métodos y muestre los resultados.
public class Matemáticas {
    static double n1; 
    static double n2;
    
    public static double suma(double n1,double n2){
        return n1 + n2;
    }
    
    public static double resta(double n1, double n2){
        return n1 - n2;
    }
    
    public static double multiplicacion(double n1, double n2){
        return n1 * n2;
    }
    
    public static double division(double n1, double n2){
        if (n2 != 0){
            return n1 / n2;
        }else {
            System.out.println("Error, no se puede dividir entre cero");
            return 0.0;
        }
    }
}