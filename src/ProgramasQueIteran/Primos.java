package ProgramasQueIteran;

public class Primos 
{
 public static boolean EsPrimo(int num)
 {
     boolean primo = true;
     for(int i =2; i < num; i++)
         if((num %i) == 0)
         {
            primo =false;
            break;
         }
     return primo;
 }
}

