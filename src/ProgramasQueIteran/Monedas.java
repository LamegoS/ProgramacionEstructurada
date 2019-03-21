package ProgramasQueIteran;

import java.util.Scanner;

public class Monedas 
{
    public static void CambioMonedas()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        int cambio;
        int M20= 0, M10 = 0,M5 = 0, M2 = 0, M1 = 0;
        System.out.println("Inserte cantidad de cambio que desea");
        cambio = entradaTeclado.nextInt();
    
        M20 = cambio/20;
        cambio = cambio - (M20*20);
        M10 = cambio/10;
        cambio = cambio - (M10*10);
        M5 = cambio/5;
        cambio = cambio - (M5*5);
        M2 = cambio/2;
        cambio = cambio - (M2*2);
        M1 = cambio/1;
        cambio = cambio - (M1*1);
            
        if (M20> 0)
            System.out.println("Monedas de 20: " + M20);    
        if (M10> 0)
            System.out.println("Monedas de 10: " + M10);
        if (M5> 0)
            System.out.println("Monedas de 5:" + M5);
        if (M2> 0)
            System.out.println("Monedas de 2: " + M2);
        if (M1> 0)
            System.out.println("Monedas de 1:" + M1);
        
    }
    
}
