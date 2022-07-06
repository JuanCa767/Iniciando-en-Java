//FUNCION GLOBAL
public class HolaMundo {
    // FUNCION PRINCIPAL
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");

        // VARIABLES
        int entero;// declarar variable 'entero'
        entero = 10;
        System.out.println(entero);
        double decimal = 5.5;
        System.out.println(decimal);
        boolean bandera = true;
        System.out.println(bandera);

        // variable que representa un caracter
        char caracter = 'a';
        System.out.println(caracter);
        String mensaje = "Hola mundo desde una variable de tipo String\n";
        System.out.println(mensaje);

        // OPERACIONES BÁSICAS
        int n1 = 10;
        int n2 = 20;
        int suma = n1 + n2;
        double n3 = 5.5;
        double n4 = 10.8;
        double multiplicacion = n3 * n4;
        multiplicacion *= 2;
        double division = n3 / n4;
        // llamar funcion
        funcion_sin_parametro();
        int resultado = sumar();
        System.out.println("Resultado de la suma " + resultado);
        restar(n1 = 50, n2 = 10);
        division = dividir(n1 = 100, n2 = 2);
        System.out.println("Resultado division " + division);

    }

    // funciones sin parametro y sin retorno
    public static void funcion_sin_parametro() {
        int n1 = 10;
        int n2 = 2;
        int resta = n1 - n2;
        // concatenar dentro de un print
        System.out.println("Resta " + resta);
    }

    // funcion sin parametro y con retorno
    public static int sumar() {
        int n1 = 10;
        int n2 = 10;
        int suma = n1 + n2;
        return suma;
    }

    // funcion con parametros y sin retorno
    public static void restar(double n1, double n2) {
        System.out.println("Resta " + (n1 - n2));

    }

    // funcion con parametros y con retorno
    public static double dividir(double n1, double n2) {
        double resultado = n1 / n2;
        return resultado;

    }

}