public class App {
    public static void main(String[] args) throws Exception {
        //crear una instancia de la claser persona
        Persona persona1 = new Persona();
        //ingresar informacion 
        persona1.setNombre("Camilo");
        persona1.setApellidos("Sarmiento");
        persona1.setCodigo(12345);

        //verficar la informacion 
        System.out.println(persona1.toString());

    }
}
