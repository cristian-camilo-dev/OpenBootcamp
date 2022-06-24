package javaBasico;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        // vectores
        Vector<Integer> vector = new Vector<Integer>(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        //capacity() devuelve el tamaño del vector
        //size() devuelve el numero de elementos del vector
        System.out.println("capacity: " + vector.capacity() + " size: " + vector.size());
        //trimToSize() reduce el tamaño del vector a la cantidad de elementos que tiene

        vector.trimToSize();

        for (int i : vector) {
            System.out.println(i);
        }



    }
}
