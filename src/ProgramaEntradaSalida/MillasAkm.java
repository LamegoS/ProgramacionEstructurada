package ProgramaEntradaSalida;

import java.util.Scanner;

public class MillasAkm 
{
    public static void MillasAkm ()
    {
        System.out.println("Ingrese valor en millas");
        Scanner scan= new Scanner(System.in);
        String dato = scan.nextLine();
        double distancia = Double.parseDouble(dato);
        double kilometros = distancia * 1.609;
        System.out.println("El valor en kilometros es: " + kilometros);
    }
    
}