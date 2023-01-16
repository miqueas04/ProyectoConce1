
package com.mycompanys.mavenproject1.logica;

import com.mycompanys.mavenproject1.persistencia.ControladoraPersistencia;


public class ControladoraL {
    
 ControladoraPersistencia controlpersis = new ControladoraPersistencia();
         
         
    public void agregarAuto(String modelo, String motor, String marca, String color, String patente, int cantPuertas) {
      //se debe crear un nuevo automovil antes de pasarlo a las persistencia
      Automovil auto = new Automovil();
      auto.setCantPuertas(cantPuertas);
      auto.setColor(color);
      auto.setMarca(marca);
      auto.setModelo(modelo);
      auto.setMotor(motor);
      auto.setPatente(patente);
      
        controlpersis.agregarAutomovil(auto);
        
    }
    
}
