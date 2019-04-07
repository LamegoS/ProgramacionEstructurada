package ProgramasConjuntoDeDatos;

import java.util.Scanner;

public class Grande12Vector 
{
    private int [] numerosInt;
    public void Grande12()
    {
        Scanner entradaTeclado = new Scanner(System.in);   
        numerosInt= new int [10];
        for(int i =1; i<numerosInt.length; i++)
        {
           System.out.println("Dame el elemento " + i + ":"); 
           numerosInt[i] = entradaTeclado.nextInt();   
        }
        
    }

    public void BuscarMayor() 
    {
        int mayor = 0, casimayor= 0;
        for (int i = 0; i < numerosInt.length; i++)
        {
            if(numerosInt[i] > mayor || numerosInt[i]> casimayor) 
                if (numerosInt[i] > mayor) 
                   if (mayor > 0)
                   {
                    casimayor= mayor;
                    mayor = numerosInt[i];
                   }
                    else
                        mayor = numerosInt[i];
                else
                    casimayor = numerosInt[i];
            
        }
        System.out.println("El mayor es : " + String.valueOf(mayor));
        System.out.println("El casi mayor es : " + String.valueOf(casimayor));
                
	
    }

}
