package EjerciciosTemas789;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String>nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Pablo");

     for (int i = 0; i < nombres.size(); i++) {
         System.out.println(nombres.get(i));
     }
        System.out.println("********************************************************");
        LinkedList<String>nombres2 = new LinkedList<String>(nombres);

     for (int i = 0; i < nombres2.size(); i++) {
         System.out.println(nombres2.get(i));
     }
    }
}
