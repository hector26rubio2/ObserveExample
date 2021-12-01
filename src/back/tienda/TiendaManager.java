/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.tienda;

import back.suscriptor.ISuscriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hecto
 */
public  class TiendaManager {

    Map<String, ArrayList<ISuscriptor>> suscriptores;

    public TiendaManager() {
        this.suscriptores = new HashMap<>();
    }

    public void agregarSuscripcion(ISuscriptor suscriptor, 
            String tipoSuscripcion) {
        if (this.suscriptores.containsKey(tipoSuscripcion)) {
            this.suscriptores.get(tipoSuscripcion).add(suscriptor);
        } else {
            ArrayList<ISuscriptor> suscriptores = new ArrayList<>();
            suscriptores.add(suscriptor);
            this.suscriptores.put(tipoSuscripcion, suscriptores);
        }
        suscriptor.enviarNotificacion("bienvenido a TIENDA PEPE");
        
        
    }
    
    public void eliminarSuscripcion(ISuscriptor suscriptor, 
            String tipoSuscripcion) {
        if (this.suscriptores.containsKey(tipoSuscripcion)) {
            this.suscriptores.get(tipoSuscripcion).remove(suscriptor);
        }
         suscriptor.enviarNotificacion("hasta pronto  TIENDA PEPE "
                 + "te espera de nuevo");
    }
    
    public void notificarSuscriptoresPortipo(String tipoSuscripcion,
            String informacion) {
        if (this.suscriptores.containsKey(tipoSuscripcion)) {
            this.suscriptores.get(tipoSuscripcion).forEach((
                    suscriptor) -> suscriptor.enviarNotificacion(informacion));
        }
    }

}
