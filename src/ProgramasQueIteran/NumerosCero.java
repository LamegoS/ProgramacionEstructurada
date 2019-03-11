package ProgramasQueIteran;

import java.util.Scanner;

public class NumerosCero 
{
    public static void Numeros (String[] args) 
    {
        Scanner entradaTeclado = new Scanner(System.in);
        do
        {
            int i;
            System.out.println("Escribe numeros enteros que no sean 0");
            i =entradaTeclado.nextInt();
                if (i == 0){
                    return;
                } else 
                {
                    System.out.println(i);   
                }
        } while (true);
    }
}
