package ProgramasQueIteran;

public class Fracciones 
{
    static float resultado = 1;
    static int i;
    public static void MenosMas()
    {
        for 
        (i=2; i<= 100; i+= 2)
        {
            if (i%4 == 0)
            {
                resultado = resultado +1.00f/i;
            }
            else
                resultado= resultado -1.00f/i;
        }
        System.out.println(resultado);
    }
}

