
package ProgramaEntradaSalida;

import java.util.Scanner;

public class EntradaSalida 
{
    public static void PideDatos()
    {
        Scanner entradaTeclado= new Scanner(System.in);
        int enteroDesdeTeclado;
        float floatDesdeTeclado; 
        String stringDesdeTeclado; 
        enteroDesdeTeclado = entradaTeclado.nextInt();
        System.out.println("Usted ingreso el entero " + enteroDesdeTeclado);
        floatDesdeTeclado = entradaTeclado.nextFloat();
        System.out.println("Usted ingreso el float " + floatDesdeTeclado);
        stringDesdeTeclado = entradaTeclado.nextLine();
        System.out.println("Usted ingreso el string " + stringDesdeTeclado);
    }
}
