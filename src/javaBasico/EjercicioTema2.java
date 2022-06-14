package javaBasico;

public class EjercicioTema2 {
    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {


        System.out.println("El precio con IVA es: " + precioConIva(10.50));
    }

    public static double precioConIva(double precio) {
        return precio * 1.21;
    }
}
