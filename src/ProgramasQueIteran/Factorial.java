package ProgramasQueIteran;

public class Factorial 
{
    public static long Factorial (long num) 
    {
     long resultado = 1;
     for (long i = 1; i <= num; i++)
         resultado *= i;
     return resultado;
     
   }   
}

