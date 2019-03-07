package ProgramaEntradaSalida;

import java.util.Scanner;

public class SuperficieCirculo 
{
    public static void SupCir()
    {
        System.out.println("Ingresa radio del circulo: ");
        Scanner scan = new Scanner(System.in);
        String dato = scan.nextLine();
        double radio = Double.parseDouble(dato);
        double PeriCirculo = (2 * 3.1416) * radio;
        System.out.println("La superficie de un circulo de esa medida es: " + PeriCirculo);    
    }
    
}
