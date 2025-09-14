
public class Main {
    
    public static void main(String[] args) {
        //--EJERCICIO 1--
        //Código mucho más limpio
        //Coche C1 = new Coche("","");
        //Coche C2 = new Coche("","");
        //Coche C3 = new Coche("","");
        //Coche.MostrarCantidad();
        
        //--EJERCICIO 2--
        //double resultadoSuma= Matemáticas.suma(13,98);
          //  double resultadoResta= Matemáticas.resta(-17,32);
               // double resultadoMultiplicacion= Matemáticas.multiplicacion(12,65.3);
                 //   double resultadoDivision= Matemáticas.division(13.6,0);
        //System.out.println("El resultado de la suma es: " + resultadoSuma +
        //"\nEl resultado de la resta es: " + resultadoResta +
        //"\nEl resultado de la multiplicación es: " + resultadoMultiplicacion +
        //"\nEl resultado de la division es: " + resultadoDivision);
        
        //--EJERCICIO 3--
        //Creamos objeto de la clase UsoIncorrectoStatic
        UsoIncorrectoStatic Ob1= new UsoIncorrectoStatic();
        
        // Llamamos al método del objeto para que inicie el proceso
        Ob1.pedirYCambiarNombre();
    }
    
}