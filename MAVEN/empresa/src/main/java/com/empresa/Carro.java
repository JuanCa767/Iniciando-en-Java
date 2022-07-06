package com.empresa;

public class Carro {
    //atributos
    private String color;
    private double vel_maxima;
    private String modelo;
    private String placa;


    public Carro(String color, double vel_maxima, String modelo, String placa) {
        this.color = color;
        this.vel_maxima = vel_maxima;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(String modelo, String placa){
        this.color = " ";
        this.vel_maxima = 0.0;
        this.modelo = modelo;
        this.placa = placa;

    }
    //getter
    public String getColor() {
        return color;
    }

    public double getVel_maxima() {
        return vel_maxima;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setVel_maxima(double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //acciones
    public void acelerar(){
        System.out.println("Acelerando");

    }

    public void frenar(){
        System.out.println("Frenando");
        
    }

    public void girar_derecha(){
        System.out.println("Giarar a la derecha");
        
    }

    public void girar_izquierda(){
        System.out.println("Giarar a la izquierda");
        
    }

    
}
