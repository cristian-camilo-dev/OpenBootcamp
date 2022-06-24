package EjerciciosTemas789;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(2);
        vector.remove(3);

        for (int i : vector) {
            System.out.println(i);
        }

        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

    }
}
