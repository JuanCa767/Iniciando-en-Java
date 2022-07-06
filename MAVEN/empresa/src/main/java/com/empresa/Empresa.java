package com.empresa;

public class Empresa {
    //atributos
    private String nobmre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Carro[] carros;

    //metodos contructores
    public Empresa() {
        inicializar();

    }

    public Empresa(String nobmre, String telefono, String direccion, String email, String nit, ) {
        this.nobmre = nobmre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        this.carros = new Carro[50];
    }

    public Empresa(String nobmre, String direccion, String nit) {
        this.nobmre = nobmre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono ="";
        this.email = "";
        this.carros = new Carro[50];
    }

    //metodo inicializar todas la variables como vacias
    public void inicializar(){
        this.nobmre = "";
        this.direccion = "";
        this.nit = "";
        this.telefono ="";
        this.email = "";
        this.carros = new Carro[50];
    }

    //consultores o 

    public String getNobmre() {
        return nobmre;
    }


    public String getTelefono() {
        return telefono;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getEmail() {
        return email;
    }


    public String getNit() {
        return nit;
    }


    //modificadores o setters

    public void setNobmre(String nobmre) {
        this.nobmre = nobmre;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setNit(String nit) {
        this.nit = nit;
    }


    //Acciones
    public void fabricar_carro(String modelo, String placa){

        Carro carro = new Carro(modelo, placa);
        this.carros[0] = carro;

    }


    public void solicitar_carro(){

    }
}
