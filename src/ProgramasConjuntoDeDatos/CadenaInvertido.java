package ProgramasConjuntoDeDatos;

import java.util.Scanner;
 
public class CadenaInvertido 
{
 
    public static void Invertido()
    {
        Scanner entradaTeclado = new Scanner(System.in);   
        String cadena;
        String Invertida= "";
        System.out.println("Introduce una cadena: ");
        cadena = entradaTeclado.nextLine();
        for (int i = cadena.length()-1; i>=0; i--)
        {
            Invertida += cadena.charAt(i);
        }
       System.out.println(Invertida); 
        
    }
}
