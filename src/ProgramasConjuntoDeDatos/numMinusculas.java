package ProgramasConjuntoDeDatos;

import java.util.Scanner;

public class numMinusculas 
{
    public static void minusculas()
    {
        Scanner entradaTeclado = new Scanner(System.in);   
        String cadena;
        int Ma=0, Mi=0;
        System.out.println("Introduce una cadena: ");
        cadena = entradaTeclado.nextLine();
        char[] cadenaArray = cadena.toCharArray();

        for (int i = 0; i < cadena.length(); i++)  
        {
            if (cadenaArray[i] >= 'a' && cadenaArray[i]<= 'z')
                Mi++;
            else if (cadenaArray[i] >= 'A' && cadenaArray[i]<= 'Z')
                Ma++;        
        }
        System.out.println("Hay " + Mi+ " minusculas");
        System.out.println("Hay " + Ma+ " mayusculas");
    }
    
}
