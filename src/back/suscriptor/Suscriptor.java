/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.suscriptor;

/**
 *
 * @author hecto
 */
public class Suscriptor implements ISuscriptor
{
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }
    public void enviarNotificacion(String informacion) {
        System.out.println("señor "+nombre+" se tiene la siguiente información "+ informacion);
    }
    
}
