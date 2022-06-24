package javaBasico;

public class ArrayBioDimensionales {
    public static void main(String[] args) {
        //Array biodimensionales

        int array[][] =  new int[2][4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] =3;
        array[0][3] =4;

        array[1][0] =10;
        array[1][1] =20;
        array[1][2] =30;
        array[1][3] =40;

        for(int i =0; i <array.length; i ++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }


    }
}
