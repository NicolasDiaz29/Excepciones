package exepciones;

import java.util.Scanner;

public class EjemploRunTimeException2 
{
    public static void main(String[] arg)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un numero: "); //Digite texto en ves de número
        int numero = entrada.nextInt();

        System.out.println(numero);
    }
}
