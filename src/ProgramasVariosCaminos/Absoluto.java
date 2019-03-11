package ProgramasVariosCaminos;

import java.util.Scanner;

public class Absoluto 
{
    public static void Abso()
    {
        Scanner entrada = new Scanner(System.in);
        int num, Abso;
        System.out.println ("Ingrese numero: ");
        num = entrada.nextInt(); 
        if (num >= 0)
           System.out.println("El Valor Absoluto es: "+ num);
        Abso= (num * -1) ;
        if (num < 0)
            System.out.println ("El Valor Absoluto es: "+ Abso); 
       
    }
}
