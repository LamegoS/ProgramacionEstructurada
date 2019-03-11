package ProgramasVariosCaminos;

import java.util.Scanner;

public class Salario 
{
    public static void Neto()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese el total de horas trabajadas: ");
        double Horas = entradaTeclado.nextDouble();
        if(Horas <= 48)
        {
            System.out.println("Tu salario bruto es de " + Horas*35);
        }
        else
        {
            double ex = (Horas - 48);
            double Tarifa2 = (35*2)* ex;
            System.out.println("Tu salario bruto con horas extra es de " + Tarifa2 );
        }
        System.out.println("Ingrese su salario bruto con o sin horas extra: ");
        double SB = entradaTeclado.nextDouble();
        if (SB <= 2000)
            System.out.println("Tu salario esta libre de impuestos y se queda igual");
        else 
            if (SB > 2000 && SB < 5000)
            {
                double Impuesto = ((SB - 2000)* .20);
                System.out.println("Tu salario neto es de" + (SB - Impuesto));
            }
            else 
                if (SB > 5000)
                {
                    double impuesto = ((SB - 5000)*.30);
                    System.out.println("Tu salario neto es de" + (SB - impuesto));
                }
    }
    
}

