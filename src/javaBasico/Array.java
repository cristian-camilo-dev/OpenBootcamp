package javaBasico;

public class Array {
    public static void main(String[] args) {
        //Array
        int array[] = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] =3;
        array[3] =4;
        array[4] =5;
       for(int i = 0; i < array.length; i++) {
           System.out.println(i);
       }
        System.out.println("***********************************************************************");
       for (int i : array) {
           System.out.println(i);
       }
        System.out.println("***********************************************************************");
       // otra forma de inicializar un array
         int array2[] = {1,2,3,4,5};
            for (int i : array2) {
                System.out.println(i);
            }
        System.out.println("***********************************************************************");
            for (int i = 0; i < array2.length; i++) {
                System.out.println(array2[i]);
            }
            System.out.println("***********************************************************************");


    }
}
