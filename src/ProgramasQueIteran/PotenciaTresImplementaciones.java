package ProgramasQueIteran;

import java.util.Scanner;
        
public class PotenciaTresImplementaciones 
{
    public static long PotenciaForSinCuerpo(long num, long potencia)
    {
        long i, potenciaCalculada = num;
        for (i=2; i< potencia; potenciaCalculada *= num, i++);
        return potenciaCalculada;
    }
    
    public static long PotenciaForConCuerpo(long num, long potencia)
    {
        long i, potenciaCalculada = 1;
        for (i=2; i< potencia; i++)
            potenciaCalculada *= num;
        return potenciaCalculada;
    }
    
    public static long PotenciaWhile(long num, long potencia)
    {
        long i =2, potenciaCalculada = num;
        while (i <= potencia)
        {
            potenciaCalculada *= num;
            i++;
        }
        return potenciaCalculada;
    }
    public static void CalculaPotencia()
    {
        long numero, potencia, resultado;
        Scanner entradaTeclado = new Scanner(System.in);
         System.out.println("Introduzca un numero: ");
         numero =entradaTeclado.nextLong();
         System.out.println("Potencia a elevar: ");
         potencia = entradaTeclado.nextLong();
         resultado = PotenciaForSinCuerpo(numero, potencia);
         System.out.println("El numero " + numero + "elevado a la potencia " + potencia + "es " + resultado);
         resultado = PotenciaForConCuerpo(numero, potencia);
         System.out.println("El numero " + numero + "elevado a la potencia " + potencia + "es " + resultado);
         resultado = PotenciaWhile(numero, potencia);
         System.out.println("El numero " + numero + "elevado a la potencia " + potencia + "es " + resultado);
    }
}

