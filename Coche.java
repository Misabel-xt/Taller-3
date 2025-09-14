import java.util.Scanner;
public class Coche {
    Scanner teclado = new Scanner(System.in);
    private String marca;
    private String modelo;
    public static int ContadorCoches = 0;
    
    public Coche(){
        ContadorCoches++;
    }
    
    public Coche(String marca, String modelo){
        //Códigp con el que se inicializará cada objeto
        this();
        System.out.println("Ingrese la marca del coche: ");
        this.marca = teclado.nextLine();
        System.out.println("Ingrese el modelo del coche: ");
        this.modelo = teclado.nextLine();
        //Reutilización de código
        MostrarValores();
    }
    
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
    
    public void MostrarValores(){
        System.out.println("La marca del coche es: " + getmarca() +
        "\nEl modelo del coche es: " + getmodelo());
    }
    
    public static void MostrarCantidad(){
        System.out.println("Se han creado hasta el momento esta cantidad de coches: " + ContadorCoches);
    }
    
}
