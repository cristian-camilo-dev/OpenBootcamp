package javaBasico;

import java.util.Locale;

public class TiposDeDatos {
    public static void main(String[] args) {
        //String
        //.length contabiliza el numero de caracteres

        String cadenaTipo = "hola soy cristian";
        System.out.println("la cadena es " + cadenaTipo);

        //toUppercase es para pasar un string a mayúsculas

        String mayusculas = cadenaTipo.toUpperCase();
        System.out.println(mayusculas);

        //toLowerCase es para pasar un string a minúsculas

        String minusculas = cadenaTipo.toLowerCase();
        System.out.println(minusculas);

        // startsWith es para saber si un string empieza con una cadena

        boolean empiezaCon = cadenaTipo.startsWith("hola");
        if (empiezaCon) {
            System.out.println("la cadena empieza con hola");
        } else {
            System.out.println("la cadena no empieza con hola");
        }

        // endsWith es para saber si un string termina con una cadena

        boolean terminaCon = cadenaTipo.endsWith("cristian");
        if (terminaCon){
            System.out.println("la cadena termina con cristian");
        } else {
            System.out.println("la cadena no termina con cristian");
        }

        //charAt es para obtener un caracter de un string

        char caracter = cadenaTipo.charAt(5);
        System.out.println("el caracter es " + caracter);

    //recorre una cadena y devuelve un array de caracteres
        for(int i=0; i<cadenaTipo.length(); i++){
            System.out.println("el caracter es " + cadenaTipo.charAt(i));
        }
    //recorre una cadena y devuelve un array de caracteres al reves
        System.out.println("***********************************************************************");
        for(int i=cadenaTipo.length()-1; i>=0; i--){
            System.out.println("el caracter es " + cadenaTipo.charAt(i));
        }
        System.out.println("***********************************************************************");
    //trim es para quitar los espacios en blanco de un string
        String cadenaTrim = "   hola soy cristian   ";
        System.out.println("la cadena es " + cadenaTrim.trim());
        System.out.println("la cadena es " + cadenaTrim);
        System.out.println("***********************************************************************");

        //replace es para reemplazar una cadena por otra

        String cadenaReplace = "hola soy cristian";
        String cadenaReplace2 = cadenaReplace.replace("hola", "adios");
        System.out.println("la cadena es " + cadenaReplace2);
        System.out.println("***********************************************************************");

        //split es para separar una cadena por un caracter

        String cadenaSplit = "hola soy cristian";
        String[] cadenaSplit2 = cadenaSplit.split("soy");
        for (int i = 0; i < cadenaSplit2.length; i++) {
            System.out.println("la cadena es " + cadenaSplit2[i]);
        }
        System.out.println("***********************************************************************");

        //indexOf es para saber la posición de un caracter en un string
        String cadenaIndexOf = "hola soy cristian";
        int posicion = cadenaIndexOf.indexOf("soy");
        System.out.println("la posicion es " + posicion);
        System.out.println("***********************************************************************");

        //lastIndexOf es para saber la posición de un caracter en un string
        String cadenaLastIndexOf = "hola soy cristian";
        int posicion2 = cadenaLastIndexOf.lastIndexOf("soy");
        System.out.println("la posicion es " + posicion2);
        System.out.println("***********************************************************************");

        //substring es para obtener una subcadena de un string
        String cadenaSubstring = "hola soy cristian";
        String cadenaSubstring2 = cadenaSubstring.substring(5);
        System.out.println("la cadena es " + cadenaSubstring2);
        System.out.println("***********************************************************************");

        //convertir un string a int
        String cadenaConvertir = "10";
        int numero = Integer.parseInt(cadenaConvertir);
        System.out.println("el numero es " + numero);
        System.out.println("***********************************************************************");

        //convertir un int a string
        int numero2 = 10;
        String cadenaConvertir2 = String.valueOf(numero2);
        System.out.println("el numero es " + cadenaConvertir2);
        System.out.println("***********************************************************************");

        //convertir un string a double
        String cadenaConvertir3 = "10.5";
        double numero3 = Double.parseDouble(cadenaConvertir3);
        System.out.println("el numero es " + numero3);
        System.out.println("***********************************************************************");

        //convertir un double a string
        double numero4 = 10.5;
        String cadenaConvertir4 = String.valueOf(numero4);
        System.out.println("el numero es " + cadenaConvertir4);
        System.out.println("***********************************************************************");

        //convertir un string a boolean
        String cadenaConvertir5 = "true";
        boolean numero5 = Boolean.parseBoolean(cadenaConvertir5);
        System.out.println("el numero es " + numero5);
        System.out.println("***********************************************************************");

        //convertir un boolean a string
        boolean numero6 = true;
        String cadenaConvertir6 = String.valueOf(numero6);




    }



}
