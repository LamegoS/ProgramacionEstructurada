package ProgramaEntradaSalida;


public class ConversionGrados 
{
    public static float FahrenheitACelcius(float Fahrenheit)
    { 
        float Celsius;
        Celsius = (float)((5.0/9.0)* (Fahrenheit - 32.0));
        return Celsius; 
    }
    
}
