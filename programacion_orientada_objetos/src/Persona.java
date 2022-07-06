

//esta clase representa a una persona
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;



    //CONSTRUCTOR
    public Persona(String nombre, String apellido){
        //this.nombre referencia al atributo
        //nombre referencia al parametro
        this.nombre = nombre;
        this.apellido = apellido;
        //System.out.println("Hola soy una persona, soy "+this.nombre+" "+this.apellido);
    }  
    
    /************************************
     * METODOS CONSULTORES
     ************************************/
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    /************************************
     * METODOS MODIFICADOES
     ************************************/
    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public void setApellido(String apellido){
        this.apellido = apellido;

    }

    /************************************
     * ACCIONES
     ************************************/
    public double calcularNomina(double valorHora){
        int cantHora = 10;
        return (cantHora * valorHora);

    }
    
}
