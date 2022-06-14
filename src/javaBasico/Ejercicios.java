package javaBasico;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tabla = 0;

        System.out.println("Introduce un numero para ver su tabla de multiplicar: ");
        tabla = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }












    }

}
