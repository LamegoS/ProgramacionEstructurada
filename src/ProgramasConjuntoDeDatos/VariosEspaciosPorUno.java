package ProgramasConjuntoDeDatos;

public class VariosEspaciosPorUno 
{
    public static String QuitaMuchosEspacios(String str)
    {
        String Simple = "";
        for (int i = 0; i < str.length(); i++)
        {
           if(str.charAt(i)!= 32)
               Simple += str.charAt(i);
           else
               if(i <str.length()-1)
                   if(str.charAt(i+1)!=32) 
                       Simple += str.charAt(i);
                else;
        }   
        return Simple;
    }
}