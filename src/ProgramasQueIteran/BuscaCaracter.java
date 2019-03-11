package ProgramasQueIteran;

import java.util.Scanner;

public class BuscaCaracter 
{
    public static void ALaCazaDelCaracter ()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        char carAleatorio, carAPedir = 0; 
        carAleatorio = (char)((Math.random() *26) + 97);
        do
        {
           System.out.print("Introduce un caracter: ");  
           carAPedir = entradaTeclado.next().charAt(0);
           if (carAPedir < carAleatorio)
                System.out.print("El caracter ingresado es Mayor\n");
           else
               if (carAPedir > carAleatorio)
                   System.out.print("El caracter ingresado es Menor\n");
               else
                   System.out.print("Encontraste el caracter\n");
        } while(carAPedir != carAleatorio);
    }
    
}

