package ProgramasConjuntoDeDatos;

public class CriptografiaCesar 
{
    public static String Encripta(String TextoPlano)
    {
        char c;
        String TextoEncriptado = "";
        for(int i= 0; i <TextoPlano.length(); i++)
        {
            c = TextoPlano.charAt(i);
            c += 6;
            TextoEncriptado += c;
            
        }
        return TextoEncriptado;
    }
    
    public static String Desencripta(String CriptogramaCesar)
    {
        char c;
        String TextoDesencriptado = "";
        for(int i= 0; i <CriptogramaCesar.length(); i++)
        {
            c = CriptogramaCesar.charAt(i);
            c -= 6;
            TextoDesencriptado += c;
            
        }
        return TextoDesencriptado;
    }
    
}
