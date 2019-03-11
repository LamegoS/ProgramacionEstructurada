package ProgramasVariosCaminos;

import java.util.Scanner;

public class Chicharronera
{
    public static void FormulaGeneral() 
    {
    float a, b, c, determinante, x1, x2;
    Scanner entradaTeclado = new Scanner(System.in);
    System.out.println("Ingresa coeficiente a: "); 
    a = entradaTeclado.nextFloat();
    System.out.println("Ingresa coeficiente b: "); 
    b = entradaTeclado.nextFloat();
    System.out.println("Ingresa coeficiente c: "); 
    c = entradaTeclado.nextFloat();
    determinante = ((float)(b*b) - (4*a*c));
    if (determinante <0)
    {
     System.out.println("La ecuacion no tiene resultados en el plano de numeros reales"); 
     return;
    }
    if (a==0)
    {
        System.out.println("a es 0, no se puede contestar"); 
        return;
    }
   //como al inicio es float, tenemos que transformarlo a double para adecuarlo 
    x1 = (- b + (float)Math.sqrt((double)determinante))/(2*a);
    x2 = (- b - (float)Math.sqrt((double)determinante))/(2*a);
    System.out.println("Las  raices de la ecuacion son: " + x1 + "," + x2 );
    }  
}
