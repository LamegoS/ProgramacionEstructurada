package ProgramasQueIteran;

import java.util.Scanner;
        
public class MCD 
{
  public static void MCD()
  {
        Scanner entradaTeclado = new Scanner(System.in);
        int N1, N2, Mayor, MCD= 0;
        System.out.println("Inserte número 1");
        N1 = entradaTeclado.nextInt();
        System.out.println("Inserte número 2");
        N2 = entradaTeclado.nextInt();
        
        if (N1>N2)
            Mayor= N1;
        else
            Mayor= N2;
        
        for(int i=1; i<Mayor; i++ )
        {
            if(N1%i == 0 &&N2%i == 0)
                MCD = i;
        }
        
        System.out.println("El máximo coumún divisor es: " + MCD);
                    
                    
  }
}
