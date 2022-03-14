package Clase2;

import java.util.Scanner;

public class Ejercicio4 {

    //INICIO
    public static void main (String args []){

    //int num = 0;
        int num = 0;

    //TECLADO;
        Scanner input = new Scanner(System.in);

    //MOSTRAR “Ingrese un número”;
        System.out.println("Ingrese un numero");

    //GUARDAR num;
        num = input.nextInt();

    //if ( num > 0 )
        if (num > 0 ){
            System.out.println("El numero es mayor a 0");
        } else {
            System.out.println("El numero es menor o igual a 0");
        }
    //MOSTRAR “El numero es mayor a 0”;
    //else
    //MOSTRAR “El numero es menor o igual 0”
    //FIN
    }

}
