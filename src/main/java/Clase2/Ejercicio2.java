package Clase2;

import java.util.Scanner;

public class Ejercicio2 {

    //INICIO
    public static void main (String args []){
    //TECLADO;
        Scanner input = new Scanner(System.in);

    //MOSTRAR “Ingrese su nombre”;
        System.out.println("Ingrese su nombre");

    //GUARDAR nombre;
        String nombre = input.next();

    //MOSTRAR “Ingrese su año de nacimiento”;
        System.out.println("Ingrese su año de nacimiento");

    //GUARDAR anio;
        int anio = input.nextInt();

    //int edad = 2021 - anio;
        int edad = 2021 - anio;

        // MOSTRAR “Su nombre es “ + nombre;
        System.out.println("Su nombre es " + nombre);

    //MOSTRAR “Su edad es “ + edad;
        System.out.println("Su edad es " + edad);

    //MOSTRAR “Hola “ + nombre + “, Ud. tiene ” + edad;
    //FIN
    }


}
