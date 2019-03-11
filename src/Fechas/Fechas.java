package Fechas;

public class Fechas 
{
 public static boolean Bisiesto(int Anio)
 {
    if((Anio % 4) != 0)// Anio no multiplo de 4
        //si no es multiplo de 4, o sea que regrese 0,no es bisiesto
        return false; 
    else
        if(Anio <=1589)//calendario juliano
            return true; 
        else
            if((Anio % 100) == 0)
                if((Anio % 400)== 0)
                    return true;
                else 
                    return false; 
            else 
                return true;
 }
}


