import java.util.Scanner;
public class Coche {
    Scanner teclado = new Scanner(System.in);
    private String marca;
    private String modelo;
    //Atributo contador estatico
    public static int ContadorCoches = 0;
    
    //Constructor por defecto estatico para imicializar contador
    public Coche(){
        ContadorCoches++;
    }
    
    public Coche(String marca, String modelo){
        //Código con el que se inicializará cada objeto
        //Llamada al cobstructor por defecto que contiene a 
        //contador, de esta manera, cada que se cree un nuevo 
        //objeto inicializará con este.
        this();
        System.out.println("Ingrese la marca del coche: ");
        this.marca = teclado.nextLine();
        System.out.println("Ingrese el modelo del coche: ");
        this.modelo = teclado.nextLine();
        //Reutilización de código
        MostrarValores();
    }
    
    //Metodos getters y setters
    public String getmodelo(){
        return modelo;
    }
    
    public void setmodelo(String modelo){
        this.modelo= modelo;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
    }
    
    //Metodo para mostrar valores de los coches 
    public void MostrarValores(){
        System.out.println("La marca del coche es: " + getmarca() +
        "\nEl modelo del coche es: " + getmodelo());
    }
    
    //Metodo para mostrar el valor de Contador
    public static void MostrarCantidad(){
        System.out.println("Se han creado hasta el momento esta cantidad de coches: " + ContadorCoches);
    }
    
}
