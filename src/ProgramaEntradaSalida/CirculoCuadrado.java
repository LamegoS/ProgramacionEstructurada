package ProgramaEntradaSalida;

import java.util.Scanner;

public class CirculoCuadrado 
{
    public static void CirCuad()
    {
        System.out.println("Ingrese valor l: ");
        Scanner scan= new Scanner(System.in);
        String dato = scan.nextLine();
        double lado = Double.parseDouble(dato);
        double AreaCuadrado = lado * lado;
        double AreaCirculo = ((3.1416) * (lado * lado)); 
        System.out.println("El area de un cuadrado con ese valor de lado seria: " + AreaCuadrado);
        System.out.println("El area de un circulo con ese valor de datos seria: " + AreaCirculo);
    }
}
