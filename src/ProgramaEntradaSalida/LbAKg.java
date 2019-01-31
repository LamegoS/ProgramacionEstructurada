package ProgramaEntradaSalida;

import java.util.Scanner;

public class LbAKg 
{
    public static void LibraKilogramo()
    {
      System.out.println("Ingrese valor en libras");
        Scanner scan= new Scanner(System.in);
        String dato = scan.nextLine();
        double peso = Double.parseDouble(dato);
        double kilogramos = peso * 0.453592;
        System.out.println("El valor en kilogramos es: " + kilogramos);
    }
    
}
