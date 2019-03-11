package ProgramasQueIteran;

import java.util.Scanner;

public class Calificaciones 
{
    public static int alumnos() 
    {
        
        Scanner entradaTeclado = new Scanner(System.in);
        int i, j;
        int numAlumnos, aprobados = 0, reprobados = 0, calificacion;
        float PromedioGrupal, SumaC = 0;
        System.out.println("Inserte Numero de alumnos: ");
        numAlumnos = entradaTeclado.nextInt();
        for (i = 1; i <= numAlumnos; i++)
        {
          System.out.println("Inserte calificacion(es): ");  
          calificacion = entradaTeclado.nextInt();
          if (calificacion < 7)
              reprobados += 1;
          else
              aprobados += 1;
          SumaC += calificacion;
        }
        PromedioGrupal = SumaC/ numAlumnos;
        System.out.println("El promedio grupal es " + PromedioGrupal);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        return 0;
    }
   
}
