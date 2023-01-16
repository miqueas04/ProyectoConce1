
package com.mycompanys.mavenproject1.persistencia;

import com.mycompanys.mavenproject1.logica.Automovil;


public class ControladoraPersistencia {

    AutomovilJpaController autoCjpa = new AutomovilJpaController();
    
    
    
    public void agregarAutomovil(Automovil auto) {
        
        
        autoCjpa.create(auto);
        
    }

    
    
}
