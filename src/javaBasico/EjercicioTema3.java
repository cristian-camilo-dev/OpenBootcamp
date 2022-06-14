package javaBasico;

public class EjercicioTema3 {
    /*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
      Tened en cuenta que los textos pueden venir de un array de tipo String. */

    public static void main(String[] args) {
        String[] textos = {"Hola", "Mundo", "Java"};
        String resultado = "";
        for (int i = 0; i < textos.length; i++) {
            resultado += " " + textos[i];
        }
        System.out.println(resultado);

        for (String texto : textos){
            System.out.println(texto);
        }



    }
}