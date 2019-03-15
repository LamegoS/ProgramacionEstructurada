package ProgramasQueIteran;

import java.util.Scanner;

public class Naturales30 
{
    public static void QVC()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        int i, num, Menor15 = 0, Entre25y45 = 0, Mayor50= 0;
        System.out.println("Inserte 30 numeros naturales");
        for (i = 1; i <= 30; i++)
        {
          System.out.println("Numero" +i);  
          num = entradaTeclado.nextInt();
          if (num < 15)
              Menor15 += 1;
          else
              if (num < 45 && num > 25)
                Entre25y45 += 1;
              else 
                  if (num > 50)
                      Mayor50 += 1;

        }
         System.out.println("Menores a 15: " + Menor15);
         System.out.println("Entre 25 y 45: " + Entre25y45);
         System.out.println("Mayor a 50: " + Mayor50);
         
    }
}
