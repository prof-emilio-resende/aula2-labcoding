package fit;

import java.util.Arrays;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Parametros recebidos: [" + Arrays.toString(args) + "]" );
        Types.testar();
        Controls.testar();
        Dynamics.testar();
        Records.testar();
        Collections.testar();
        Collections.testarHashing();
        Functions.testar();
        Streams.testar();
    }
}