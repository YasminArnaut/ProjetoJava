package Testes;

import java.util.Locale;

public class Erros {
    public static void main (String args[])
    {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e)
        {
            System.out.println("A frase inicial é nula, para solucionar o problema " +
                    "foi lhe atribuido o valor default.");
            frase= "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase Antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }
}
