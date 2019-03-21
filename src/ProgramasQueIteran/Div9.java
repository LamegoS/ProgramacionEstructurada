package ProgramasQueIteran;

import java.util.Scanner;

public class Div9 
{
     static boolean Nueve = false; 
  public static void DivisibleNueve()
  {
    Scanner entradaTeclado = new Scanner(System.in);
    int num= 0, variable = 0, residuo; 
    System.out.println("Ingrese numero: ");
    num = entradaTeclado.nextInt();
     while (num > 0)
        {
            residuo = (num % 10);
            num = (num / 10);
            variable += residuo;
        }
       System.out.println(variable);
       Div9.Divi9(variable);
       if (Nueve == true)
           System.out.println("Es divisible con 9");
       else 
           System.out.println("NO Es divisible con 9");
  }
  
  public static boolean Divi9(int num)
  {
      if (num%9 == 0)
          Nueve = true;
      else 
          Nueve = false;
      return Nueve;
  }
}
