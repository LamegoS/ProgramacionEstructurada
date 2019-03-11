package ProgramasQueIteran;

import java.util.Scanner;

public class Invertido 
{
    public static void Invertido()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        int num, invertido= 0, i;
        System.out.print("Introduce un numero entero\n"); 
        num = entradaTeclado.nextInt();

        for (i = 1; i<= num; i*=10)
        {
            invertido = (num/i)%10;
            System.out.print(invertido); 
        }
         System.out.println(""); 
    }
}
