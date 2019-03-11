package ProgramasVariosCaminos;

import java.util.Scanner;

public class LlamadaTelefonica 
{
    
    public static void Tel()
    {
       int costo, ext;
       Scanner datos = new Scanner (System.in);
        System.out.println("Ingresa los minutos de duracion de llamada : ");
        costo = datos.nextInt();
        
        if (costo > 3){
            costo -= 3;
            ext = costo + 5;
            System.out.println("Hablaste " + costo + " minutos extras");
            System.out.println("El costo total de llamada es de $" + ext);
        } else {
            System.out.println("El costo es de %5 ");
           
        }
    
    
    }
}