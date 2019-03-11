package ProgramasQueIteran;

public class NumerosPerfectos 
{
    public static int SumaDivisoresPropios(long num)
    {
        int suma = 0;
        for (int i=1; i < num; i ++)
            if ((num % i) == 0) // i es divisor de num
                suma += i;
        return suma;
    }
    
    public static boolean EsNumeroPerfecto(long  num)
    {
        if (SumaDivisoresPropios(num) == num)
            return true;
        else 
            return false;
    }
    public static void ImprimeCienPerfectos()
    {
        int numero = 1, numperfectos = 0;
        while(true)
        {
            if(EsNumeroPerfecto(numero))
            {
                numperfectos++;
                System.out.print("El " + numero + " es numero perfecto\n");
            }
            numero ++;
            if(numperfectos == 100)
                break;
        }
    }
}
