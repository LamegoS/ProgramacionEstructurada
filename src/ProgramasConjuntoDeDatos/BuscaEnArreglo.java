package ProgramasConjuntoDeDatos;

import java.util.Scanner;

public class BuscaEnArreglo 
{
    private int [] variosInt;
    //Declaro arreglo y lo lleno
    public  void LlenaArreglo()
    {
        Scanner entradaTeclado = new Scanner(System.in);   
        variosInt= new int [10];
        for(int i =0; i<variosInt.length; i++)
        {
           System.out.println("Dame el elemento" + i + ":"); 
           variosInt[i] = entradaTeclado.nextInt();   
        }
        
    }
    //Busco en arreglo
    public int BuscaArreglo()
    {
        Scanner entradaTeclado = new Scanner(System.in);   
        System.out.println("Dame el elemento a buscar en arreglo"); 
        int elem = entradaTeclado.nextInt();
        for(int i =0; i<variosInt.length; i++)
            if(variosInt[i] == elem)
                return i;
        return -1;
    }
}
