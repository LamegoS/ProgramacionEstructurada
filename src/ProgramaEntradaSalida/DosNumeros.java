package ProgramaEntradaSalida;

import java.util.Scanner;

public class DosNumeros 
{
    public static void DosNum()
    {
       Scanner reader = new Scanner(System.in);
       double numero1 = 0;
       double numero2 = 0;
       System.out.println("Introduce el primer número:");			
       numero1 = reader.nextInt();
       System.out.println("Introduce el segundo número:");
       numero2 = reader.nextInt();
       double suma = numero1 + numero2;
       double producto = numero1 * numero2;
       double diferencia = numero1 - numero2;
       double cociente = ((numero1)/(numero2));
       System.out.println("La suma de los números es: " + suma);
       System.out.println("El producto de los números es: " + producto);
       System.out.println("La diferencia de los números es: " + diferencia);
       System.out.println("El cociente de los números es: " + cociente);
    }
            
}
