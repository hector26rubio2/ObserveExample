/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front;

import back.producto.Producto;
import back.suscriptor.Suscriptor;
import back.tienda.Tienda;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hecto
 */
public class PruebaTienda {
    
    public static void retardo(int tiempo)
    {
        try {
            Thread.sleep(tiempo*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PruebaTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        
        Suscriptor suscriptor1 = new Suscriptor("pepe");
        Suscriptor suscriptor2 = new Suscriptor("paz");
        Suscriptor suscriptor3 = new Suscriptor("parrilla");
        
        PruebaTienda.retardo(2);
        
        tienda.agregarSuscripcion(suscriptor1, "Comida");
        tienda.agregarSuscripcion(suscriptor2, "tecnología");
        tienda.agregarSuscripcion(suscriptor3, "cochinadas");
        
        PruebaTienda.retardo(2);
        
        Producto producto = new Producto("cochinadas", "revistaX", 30000);
        tienda.agregarProducto(producto);
        
    }

}
