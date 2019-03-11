package ProgramasQueIteran;

public class CalculaE 
{
    public static double CalulaE()
    {
        double e = 1.0;
        int i;
        for (i =1; i <= 15; i++)
            e += 1.0/ (double)Factorial.Factorial(i);
        return e;
    }
   
}

