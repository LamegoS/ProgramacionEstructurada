package ProgramasQueIteran;

import java.util.Scanner;

public class ParImpar 
{
    public static void ParImpar()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        int i, n;
        for( i=1; i <= 10; i++)
        {
            System.out.println("Introduce un numero");
            n = entradaTeclado.nextInt();
            
            if(n%2 == 0)
            {
                System.out.println("Es par"); 
            }
            else 
            {
                System.out.println("Es impar");
            }
        }

    }
    
}
