package Clase2;

import java.util.Scanner;

public class EjerciciosWhile {

    public static void main (String args []){

        int num = -1;
        int suma = 0;
        int contador = 0 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese numeros hasta ingresar un 0");

        while (num != 0){
             System.out.println("Ingrese un numero");
             num = input.nextInt();

             if (num != 0){
                 suma = suma + num;
                 contador = contador + 1;
             }


        }
        System.out.println("La suma total es " + suma);
        System.out.println("Cantidad de numeros ingresados: " + contador);
        System.out.println("El promedio es  " + suma / contador);
        System.out.println("El programa ah finalizado !!");
    }
}
