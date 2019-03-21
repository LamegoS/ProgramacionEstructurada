package ProgramasQueIteran;

import java.util.Scanner;

public class SumaImpares 
{
  public static void Impar()
    {
        int i, suma = 0, n; 
        Scanner scanner= new Scanner (System.in);
        System.out.println("Ingresa un numero");
        n= scanner.nextInt();
        for(i=1;i<=n;i++)
        {
        suma = suma + (2*i-1);
        }
        System.out.println("Los " + n + " primeros numeros impares suman " + suma);
        
    }   
}
