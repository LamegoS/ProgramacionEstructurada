package ProgramasQueIteran;

import java.util.Scanner;

public class Boliche 
{
    public static void Puntuacion()
    {
        Scanner datos = new Scanner (System.in);
        int i, puntuacion = 0, puntos = 0;
        System.out.println("Bienvendio al boliche.\nA continuacion escribe cuantos pinos tumbaste en cada entrada y cuales fueron chuzas");
        for( i=1; i <= 10; i++)
        {
            System.out.println("Entrada " + i);
            System.out.println("Escribe 1 si hiciste chuza a la primera o 0 si no lo hiciste");
            int exito = datos.nextInt();
            if (exito == 1)
            {
                puntos = 10;
                puntuacion += 10;
            }    
            else  
            {
                System.out.println("Escribe cuantos pinos tumbaste");
                puntos = datos.nextInt();   
                puntuacion += puntos; 
            } 
        }
        System.out.println("La puntuacion final es " + puntuacion);  
    }
}
