public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private Integer codigo;

    //CONSTRUCTOR VACIO 
    public Persona() {
    }
    //CONTRUCTOR
    public Persona(String nombre, String apellidos, Integer codigo){
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.codigo= codigo;
    }

    //GENERAR GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    //METODO TO STRING()
    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", codigo=" + codigo + ", nombre=" + nombre + "]";
    }    
}
