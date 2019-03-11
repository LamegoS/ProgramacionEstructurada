package ProgramasQueIteran;

public class NumeroBueno 
{
    public static int SumaDigitosNumero (int num)
    {
        int sumaDigitos = 0;
        while(num>0)
        {
           sumaDigitos += num %10;
           num /= 10;
        }
    return sumaDigitos;
    }
    public static int SumaFactoresPrimos(int num)
    {
        int suma = 0;
        for(int i = 2; i < num; i++)
            if ((num % i) == 0)
                //System.out.print(i + "\t");
                if(Primos.EsPrimo(i))
                {
                    suma += SumaDigitosNumero(i);
                }
        return suma;        
    }
    public static boolean EsNumeroBueno(int num)
    {
        if (SumaDigitosNumero(num) ==SumaFactoresPrimos(num))
            return true;
        else
            return false;
    }
    public static void ImprimeBuenos()
    {
        int numero =1, numBuenos =0;
        while (true)
        {
            if(EsNumeroBueno(numero))
            {
                System.out.print("El " + numero +" es numero bueno");
                numBuenos++;
            }         
            numero++;
            if(numBuenos == 10)
                break;
        }
    }
}
