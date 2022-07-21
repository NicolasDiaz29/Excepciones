package exepciones;

import java.util.Scanner;

public class EjemploIOException 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para dividir");
        System.out.println();

        try
        {
            int numerador, denominador, resultado;
            System.out.print("Digite el numerador: ");
            numerador = sc.nextInt();
            System.out.print("Digite el denominador: ");
            denominador = sc.nextInt();
            resultado = numerador/denominador;
            System.out.print("El resultado es: " + resultado);
        }

        catch (ArithmeticException ae)
        {
            System.out.println("No se puede dividir en cero");
        }       
    }    
}
