package ProgramaEntradaSalida;

import java.util.Scanner;

public class Desaceleracion 
{
    public static void CalculaDesaceleracion()
    {  
        Scanner entradaTeclado = new Scanner(System.in);
        float VelInicial, VelFinal, desaceleracion, tasadesaceleracion, tiempoparareposo;
        int tiempo;
        System.out.println("Dame velocidad inicial del ciclista: ");
        VelInicial = entradaTeclado.nextFloat();
        System.out.println("Dame velocidad final del ciclista: ");
        VelFinal = entradaTeclado.nextFloat();
        System.out.println("Dame los minutos entre inicial y final: ");
        tiempo = entradaTeclado.nextInt();
        desaceleracion= (VelFinal - VelInicial )/ tiempo;
        System.out.println("La desaceleracion es " + desaceleracion);
        tasadesaceleracion = desaceleracion / (((float)tiempo*60) * tiempo);
        System.out.println("La tasa de desaceleracion es " + tasadesaceleracion);
        tiempoparareposo = VelFinal / tasadesaceleracion;
        System.out.println("El timepo para el reposo es " + tiempoparareposo + "segundos");
    }
}