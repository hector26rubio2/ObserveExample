/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package back.tienda;

import back.producto.Producto;
import back.suscriptor.ISuscriptor;
import java.util.ArrayList;

/**
 *
 * @author hecto
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    private TiendaManager manager;
    private ArrayList<Producto> productos;

    public Tienda() {
        this.manager = new TiendaManager();
        this.productos = new ArrayList<>();
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        notificarSuscriptoresPorTipo(producto.getCategoria()
                ,"se ha añadido un nuevo producto "+producto.getNombre());
        
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
         notificarSuscriptoresPorTipo(producto.getCategoria()
                ,"ya no se tiene el producto: "+producto.getNombre());

    }

    public void agregarOfertaCategoria(String categoria, float descuento) {
        productos.forEach((producto)-> {
            if(producto.getCategoria().equals(categoria)){                  
            producto.setDescuento(descuento);
            }});
        notificarSuscriptoresPorTipo(categoria,
                "todos los productos de "+categoria+" tienen un "+descuento+"%");
       //
    }

    public void quitarOfertaCategoria(String categoria) {
       productos.forEach((producto)-> {
            if(producto.getCategoria().equals(categoria)){                  
            producto.setDescuento(0);
            }});
        notificarSuscriptoresPorTipo(categoria,
                "todos los productos de "+categoria+" ya no tienen descuento");
              
    }

    public void agregarSuscripcion(ISuscriptor suscriptor, String tipoSuscripcion) {
        this.manager.agregarSuscripcion(suscriptor, tipoSuscripcion);
    }

    public void elimnarSuscripcion(ISuscriptor suscriptor, String tipoSuscripcion) {
        this.manager.eliminarSuscripcion(suscriptor, tipoSuscripcion);
    }

    private void notificarSuscriptoresPorTipo( String tipoSuscripcion,String informacion) {
        this.manager.notificarSuscriptoresPortipo( tipoSuscripcion,informacion);
    }
}
