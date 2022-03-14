package Clase2;

import java.util.Scanner;

public class Ejercicio3 {

    // INICIO
    public static void main (String arg[]){



    //int num1 = 0;
        int num1= 0;
    //int num2 = 0;
        int num2= 0;
    //int num3 = 0;
        int num3= 0;

    //TECLADO;
        Scanner input = new Scanner(System.in);

    //MOSTRAR “Ingrese el primer numero”;
        System.out.println("Ingrese un número");

    //GUARDAR num1;
        num1 = input.nextInt();

    //MOSTRAR “Ingrese el segundo numero”;
        System.out.println("Ingrese otro numero");

    //GUARDAR num2;
        num2 = input.nextInt();

    //MOSTRAR “Ingrese el tercer numero”;
        System.out.println("Ingrese el ultimo numero");

    //GUARDAR num3;
        num3 = input.nextInt();

    //int sumaTotal = num1 + num2 + num3;
        int suma = num1 + num2 + num3;

    //MOSTRAR “La suma es ” + sumaTotal;
        System.out.println("La suma es " + suma);

    //FIN
    }
}
