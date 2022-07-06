/*package co.edu.utp.misiontic2022.reto1.p45;
 * 
 * 1)Crear clase "BecaUniversitaria" 
 * 2) Crear metodo comparaInversion -> Sobrecargar metodos con parametros y sin parametros
 *  Parametros.
 *          tiempo
 *          monto
 *          interes
 * Retornar un String:
 *      "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia
 * En caso de que no se envien los datos o se instancie el contructor sin parametros: 
 *      "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada."

 aplicar la sobrecarga de metodos al contructor

 nota: Redondear los resultados con Math.round()

 FORMULAS
 interesSimple = monto * (interes/100)*100
 * 
 * interesCompuesto = monto *( (1 + (interes/100))^tiempo -1 )
 * 
 * compararInversion = interesCompuesto - interesSimple.
 * 
*/

public class BecaUniversitaria {
    //ATRIBUTOS
    private int pTiempo;
    private double pMonto;
    private double pInteres;

    //CONSTRUCTOR

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }

    public BecaUniversitaria(){
        this.pTiempo = 0;
        this.pMonto = 0.0;
        this.pInteres = 0.0;
    }

    //ACCIONES / METODOS

    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        
    }

    public String compararInversion ( ){
        if(pInteres == 0 && pTiempo == 0 && pMonto == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }else{
            double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
        //return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }

    public double calcularInteresSimple(){
        double interesSimple = Math.round(pMonto * (pInteres/100)* pTiempo);
        return interesSimple;
    }   
    public double calcularInteresCompuesto( ){
        double resultado = Math.pow((1 + (pInteres/100)), pTiempo);
        double interesCompuesto = Math.round(pMonto *( resultado -1 ));
        return interesCompuesto;        
    }
    
    
}
