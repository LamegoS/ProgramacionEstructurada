package ProgramasQueIteran;

public class CuboCuadrado 
{
    public static void CuboCuadrado()
    {
        int i, num = 20, cuadrado= 0, cubo = 0;
        for (i= 1; i <= num; i++)
        {
            cuadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            System.out.println(i + "\t"+ cuadrado + "\t" + cubo);
        }  
    }
    
}
