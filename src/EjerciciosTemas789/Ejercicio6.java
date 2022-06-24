package EjerciciosTemas789;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        }catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
    }
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
