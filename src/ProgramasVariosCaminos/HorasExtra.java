package ProgramasVariosCaminos;

import java.util.Scanner;

public class HorasExtra 
{
    public static boolean Extras()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese su tarifa por hora: ");
        double Tarifa = entradaTeclado.nextDouble();
        System.out.println("Ingrese el total de horas trabajadas: ");
        double Horas = entradaTeclado.nextDouble();
        if(Horas <= 40)
        {
            System.out.println("Tu sueldo es de " + Tarifa);
        }
        else
        {
            System.out.println("Ingrese numero de horas extra: ");
            double ex = entradaTeclado.nextDouble();
            double Tarifa2 = (Tarifa*2)* ex;
            System.out.println("Tu sueldo es de " + Tarifa2 );
        }
        return true;
    } 
    
}