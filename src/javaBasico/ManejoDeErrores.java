package javaBasico;

import java.util.Scanner;

public class ManejoDeErrores {
    // dividimos los errores en 3 tipos:
    // 1. Errores de compilacion
    // 2. Errores de ejecucion
    // 3. Errores de logica

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("ingrese otro numero: ");
        int numero2 = sc.nextInt();


        //manejo de errores try catch finally

        try {
            int resultado = numero / numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }

        //generar una excepcion




    }
}
