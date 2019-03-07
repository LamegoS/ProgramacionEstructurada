package ProgramaEntradaSalida;

import java.util.Scanner;

public class Importe 
{
    public static void DespliegaImporte()
    {
       Scanner entradaTeclado = new Scanner(System.in);
       float importe,importeIVA, IVA;
       System.out.println("Dame el importe: ");
       importe = entradaTeclado.nextFloat();
       IVA = (importe *15)/100;
       System.out.println("El IVA es: "+ IVA);
       importeIVA = importe + IVA;
       System.out.println("El importe con el IVA es: "+ importeIVA);
    }
}

