
import java.util.Scanner;

/**
 * Hallar el volumen de un tronco cono a partir de un cono completo * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: 
        // 1. Definicion de variables
        // Datos de entrada
        double r1, h1, r2, h2;
    
        // Datos de salida
        double volumenTronco_cono;
        
        // Variables adicionales
        double volumencono, volconosup;
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese el radio del cono completo:");
        r1 = teclado.nextDouble();
        System.out.print("Ingrese la altura del cono completo");
        h1 = teclado.nextDouble();
        System.out.print("Ingrese el radio del cono deficiente:");
        r2 = teclado.nextDouble();
        System.out.print("Ingrese la altura del cono deficiente");
        h2 = teclado.nextDouble();
        
        
        
        
        // 2. Realizar calculos
        volumencono = ((h1 * Math.PI)/3) * r1;
        volconosup = ((h2 * Math.PI)/3) * r2;
        volumenTronco_cono = volumencono - volconosup;
 
     
        
                  
        // 3. Mostrar datos de salida
        System.out.println("El volumen del tronco cono es de:" + volumenTronco_cono);
        
        

        
        
        
         
  } //Fin de la clase principal
}
