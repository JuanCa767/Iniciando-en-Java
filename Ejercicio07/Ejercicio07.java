/*
 *  Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
*/

import java.util.Scanner;

public class Ejercicio07{

    public static void main(String[] args){
        var sc = new Scanner(System.in);
        Double iva;
        Double cantidad, precio;
        System.out.println("Ingrese los datos para el calculo del producto");
        System.out.println("Digite la cantidad del producto: ");
        cantidad = sc.nextDouble();
        System.out.println("Digite el precio del producto: ");
        precio=sc.nextDouble();
        System.out.println("Digite el iva del producto: ");
        iva=sc.nextDouble();

        var rp = calculoPrecio(iva, cantidad, precio);
        System.out.println("El precio total a pagar inlcuido iva es: "+rp);      
    }

    public static Double calculoPrecio(Double iva, Double cantidad, Double precio){

        Double resultado, resultado1, suma;
        resultado = cantidad * precio;
        resultado1= resultado*iva;
        suma = resultado + resultado1;

        return suma;

    }
}