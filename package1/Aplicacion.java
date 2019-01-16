package package1;

import java.util.Scanner;
import package2.Persoal;

/**
 *
 * @author emendezduran
 */
public class Aplicacion {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        Academica a1 = new Academica("ramon",new Persoal(66677788,"ramon@correo.es"));
        
        
        do{ 
        System.out.println("Introducir nota del alumno entre 0 y 10");  
        }while(!a1.setNota(scan.nextFloat()));
        System.out.println(a1.toString());
        
        
        
    }
    
}
