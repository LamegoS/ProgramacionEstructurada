package ProgramasVariosCaminos;

import java.util.Scanner;

public class EXAMEN 
{
    public static void Balero()
    {
        System.out.println("Bienvenido al juego de balero. Ingresa en numero de ensarte que hiciste");
        System.out.println("1)Sencillo\n2)Capirucho Sencillo\n3)Clasico\n4)Capirucho Complicado\n5)Cruzado\n6)Revés\n7)Jalon\n8)Invertido");
        Scanner datos = new Scanner (System.in);
        int ensarte = datos.nextInt();
        System.out.println("Escribe 1 si tu tiro fue exitoso y 0 si no lo fue");
        int exito = datos.nextInt();
        if (exito ==1)
        {
            if (ensarte == 1)
              System.out.println("Tienes 1 punto");  
            else 
                if (ensarte == 2)
                    System.out.println("Tienes 5 puntos");  
            if (ensarte == 3)
              System.out.println("Tienes 10 puntos");  
            else 
                if (ensarte == 4)
                    System.out.println("Tienes 10 puntos"); 
            if (ensarte == 5)
              System.out.println("Tienes 50 puntos");  
            else 
                if (ensarte == 6)
                    System.out.println("Tienes 100 puntos"); 
            if (ensarte == 7)
              System.out.println("Tienes 250 puntos");  
            else 
                if (ensarte == 8)
                    System.out.println("Tienes 500 puntos"); 
        }   
        else
            if (exito == 0)
                System.out.println("Tienes 0 puntos");  
            
 }
        
}
