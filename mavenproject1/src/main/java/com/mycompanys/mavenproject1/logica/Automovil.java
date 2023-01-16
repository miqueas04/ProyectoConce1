
package com.mycompanys.mavenproject1.logica;


public class Automovil {
    
    private int id;
    private String modelo;
    private String motor;
    private String marca;
    private String color;
    private String patente;
    private int cantPuertas;
    
    //Constructors

    public Automovil() {
    }

   

    public Automovil(int id, String modelo,String motor, String marca, String color, String patente, int cantPuertas) {
        this.id = id;
        this.modelo = modelo;
        this.motor = motor;
        this.marca = marca;
        this.color = color;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }

    
      //Gets and sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
     public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
    
    
    
}
