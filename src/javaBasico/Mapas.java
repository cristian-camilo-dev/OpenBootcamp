package javaBasico;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        //HashMap   (Mapa de clave valor)
        HashMap<String,Integer> mapa = new HashMap<>();
        //agregar elementos
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        mapa.put("tres", 3);
        //replace() reemplaza un valor por otro
        mapa.replace("uno", 10);
        //remove() elimina un elemento
        mapa.remove("dos");
        //containsKey() devuelve true si la clave existe
        System.out.println(mapa.containsKey("uno"));
        //containsValue() devuelve true si el valor existe
        System.out.println(mapa.containsValue(10));
        //recorrer el mapa
        for (String key : mapa.keySet()) {
            System.out.println(key + ": " + mapa.get(key));

        }
        for(Map.Entry elemento : mapa.entrySet()){
            System.out.println(elemento.getKey() + ": " + elemento.getValue());
        }
    }
}
