package ProgramasQueIteran;

import java.util.Scanner;

public class Multiplos5 
{
   public static void CincoAN (String[] args) 
   {
        Scanner entradaTeclado = new Scanner(System.in);
        int n;
        System.out.println("Escribe limite de multiplos de 5");
        n =entradaTeclado.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (i % 5 == 0)
                System.out.println(i);
        }
            
   }
            
}
