package ProgramasVariosCaminos;

import java.util.Scanner;

public class NumerosMaMe 
{
    
    public static void MaOMe(){

        Scanner datos = new Scanner (System.in);
        System.out.println("Ingresa numero 1: ");
        int numero1 = datos.nextInt();
        System.out.println("Ingresa numero 2: ");
        Scanner datos2 = new Scanner (System.in);
        int numero2 = datos2.nextInt();
        
        if(numero1 == numero2)
        {
            System.out.println("Los numeros son iguales");
        }
        else 
            if (numero1 > numero2)
            {
            System.out.println( numero1 + " es mayor que" + numero2 );
            }
            else{
            System.out.println(numero2 + " es mayor que" + numero1 );
        
        }
        
    
    
    }
    
}
