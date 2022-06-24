package EjerciciosTemas789;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
         * La tarea de la función será realizar la copia del fichero dado en el parámetro
         *  "fileIn" al fichero dado en "fileOut"
         * */

        copiarFichero("\\Users\\34642\\Desktop\\fichero.txt" , "\\Users\\34642\\Desktop\\fichero2.txt");

    }
       public static void copiarFichero(String fileIn, String fileOut) {
            try {
                InputStream in = new FileInputStream(fileIn);
                byte[] datos = in.readAllBytes();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);



            }catch (Exception e) {
                System.out.println("Error al abrir el fichero" + e.getMessage());
            }

       }


        }


