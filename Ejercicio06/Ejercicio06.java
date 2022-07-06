/*
* Programa que pida por teclado la fecha de nacimiento de una persona
(día, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha
de nacimiento y a continuación sumando las cifras obtenidas en la suma.*
* */

package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        //sc scanner 
        var sc = new Scanner(System.in);
        //declaracion de variables
        int dia, mes, ano, suma, suerte, cifra1, cifra2, cifra3, cifra4;        
        System.out.println("Introduzca la fecha de su nacimiento ");
        System.out.println("día: ");
        dia = sc.nextInt();
        System.out.println("Mes: ");
        mes = sc.nextInt();
        System.out.println("Año: ");
        ano = sc.nextInt();

        suma = dia + mes + ano;
        cifra1 = suma / 1000;
        cifra2 = suma / 100 % 10;
        cifra3 = suma / 10 % 10;
        cifra4 = suma % 10;

        suerte = cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println("Su numero de la suerte es: " + suerte);
    }

}
