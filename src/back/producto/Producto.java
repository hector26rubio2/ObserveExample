/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.producto;

/**
 *
 * @author hecto
 */
public class Producto {
    private String categoria;
    private String nombre;
    private float precio;
    private float descuento;

    public Producto(String categoria, String nombre, float precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = 0;
    }

   

    public void setDescuento(float descuento) {
        this.descuento = descuento;
        
    }  

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public float getPrecio() {
        return precio;
    }
    
    
}
