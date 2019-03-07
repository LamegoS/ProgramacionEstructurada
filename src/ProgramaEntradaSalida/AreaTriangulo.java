package ProgramaEntradaSalida;

import java.util.Scanner;

public class AreaTriangulo 
{
    public static void AreaTri()
    {
        Scanner reader = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        System.out.println("Introduce el valor de la base: ");
        base = reader.nextInt();
        System.out.println("Introduce el valor de altura: ");
        altura = reader.nextInt();
        double area = ((base * altura)/ 2);
        System.out.println("El area de este triangulo es: " + area);
    }
    
}
