package ProgramasConjuntoDeDatos;

import java.util.Scanner;

public class DiferenciaVector 
{
    public int [] Datos;
    public void LlenaVector()
    {
        Scanner entradaTeclado = new Scanner(System.in);   
        System.out.println("Vector A de tamaño 5"); 
        Datos = new int[5];
        for(int i =0; i< Datos.length; i++)
        {
           int n= i+1;
           System.out.println("Dame el elemento " + n + ":"); 
           Datos[i] = entradaTeclado.nextInt();   
        }
    }
    public void EncuentraDiferencia()
    {
       int E1=0,E2=0, dif=0;
       for (int i = 0; i < Datos.length;i++)
       {
           if (i==0) 
           {
               continue;
           }
           { 
                if (Datos[i] - Datos[i-1]> dif)
                 {
                    dif = (Datos[i] - Datos[i-1]);
                    E1 = i; 
                    E2 = i+1;
                 }
                 
            }
       } 
       System.out.println("La diferencia más grande es entre elemento número " +E2+ " y elemento número " +E1+ " siendo "+dif ); 
       
    }
}
