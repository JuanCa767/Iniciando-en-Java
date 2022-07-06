public class App {
    public static void main(String[] args) throws Exception {
        //contruir un objeto de tipo persona
        //new Persona("Juan","Hernandez");
        Persona objPersona_1 = new Persona("Juan","Hernandez");
        //Accdeder al nombre
        String nombre = objPersona_1.getNombre();
        System.out.println("Nombre: "+nombre);
        //Modificar nombre
        objPersona_1.setNombre("Camila");
        objPersona_1.setApellido("Cifuentes");
        System.out.println(objPersona_1.getNombre()+" "+objPersona_1.getApellido());

        Persona objPersona_2 = new Persona("Ramiro", "Castiblanco");
        Persona objPersona_3 = new Persona("Alba", "Camargo");

        double nomina_p1 = objPersona_1.calcularNomina(5.5);
        double nomina_p2 = objPersona_1.calcularNomina(5.2);
        double nomina_p3 = objPersona_1.calcularNomina(5.8);

        System.out.println(objPersona_1.getNombre()+" -Nomina "+nomina_p1);
        System.out.println(objPersona_2.getNombre()+" -Nomina "+nomina_p2);
        System.out.println(objPersona_3.getNombre()+" -Nomina "+nomina_p3);




    }
}
