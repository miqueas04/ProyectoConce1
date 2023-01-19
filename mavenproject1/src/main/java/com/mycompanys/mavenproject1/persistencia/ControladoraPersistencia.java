
package com.mycompanys.mavenproject1.persistencia;

import com.mycompanys.mavenproject1.logica.Automovil;
import com.mycompanys.mavenproject1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    AutomovilJpaController autoCjpa = new AutomovilJpaController();
    
    
    
    public void agregarAutomovil(Automovil auto) {
        
        
        autoCjpa.create(auto);
        
    }

    

    public List<Automovil> traeAutos() {
        
        return autoCjpa.findAutomovilEntities();
        
    }

    public void borraAuto(int idAuto) {
        try {
            autoCjpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
