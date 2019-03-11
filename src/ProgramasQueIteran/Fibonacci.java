package ProgramasQueIteran;

import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner entradaTeclado = new Scanner(System.in);
        int F1 = 0;
        int F2 = 1;
        int n;
        int F; 
        System.out.println("¿Cuantos numeros quieres ver?");
        n = entradaTeclado.nextInt();
        System.out.println("Serie Fibonacci del 1 al " + n);

        for (int i =1; i <= n; i++) 
        {
            F = F1; 
            F1 = F2 + F1;
            F2 = F;

            System.out.println(F2);
        }
    }
}
