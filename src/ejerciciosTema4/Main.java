package ejerciciosTema4;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice("Xiaomi", "Mi", "azul", "smartphone", 16);
        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S8", "azul", "smartphone", 64, "Android", 5.5, 0.5);
        SmartWatch smartWatch = new SmartWatch("Apple", "Watch Series 3", "rojo", "smartwatch", 32, true);


        System.out.println(smartDevice.toString());
        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());










    }
}