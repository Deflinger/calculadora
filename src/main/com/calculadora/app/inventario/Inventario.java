package com.calculadora.app.inventario;
/* Paola Contreras López
* Miguel Angel Guzmán Figueroa
* Cesar Alejandro Virgen Herrera
*/

import java.util.Hashtable;
import java.util.Enumeration;

public class Inventario {
	 private Hashtable<String, Integer> existencia; 
     private Hashtable<String, Integer> precios; 
     private Hashtable<String, Hashtable> productos;
		
     public Inventario() {
    	 cargarInventario();
     }

     private void cargarInventario(){
    	 Enumeration products;
    	 String str;
    	 int precio;
    	 
    	  existencia =new Hashtable<String, Integer>();
    	  productos =new Hashtable<String, Hashtable>();
    	  precios =new Hashtable<String, Integer>();

    	   existencia.put("Laptops", new Integer(200));
    	   existencia.put("Monitores", new Integer(200));
    	   existencia.put("Teclados", new Integer(200));
    	   existencia.put("Mouses", new Integer(200));
    	   existencia.put("Enfriadores", new Integer(200)); 
    	   


    	   precios.put("Laptops", new Integer(6000));
           precios.put("Monitores", new Integer(2500));
           precios.put("Teclados", new Integer(500));
           precios.put("Mouses", new Integer(400));
           precios.put("Enfriadores", new Integer(1500));


    	   productos.put("Existencia", existencia);
    	   productos.put("Precios", precios);


    	   
     }
     
     public Hashtable getProductos() {
    	  return productos;
    }
     
     public void setProductos(Hashtable productos) {
    	 this.productos = productos;
     }
	  
     public void solicitoInventario(Hashtable<String, Integer> existencia) {
    	 if(existencia.get("Laptops") <= 0) {
    		 System.out.println("Se crea una solicitu por 200 Laptops");
    	 }
    	 if(existencia.get("Monitores") <= 0) {
    		 System.out.println("Se crea una solicitu por 200 Monitores");
    	 }
    	 if(existencia.get("Teclados") <= 0) {
    		 System.out.println("Se crea una solicitu por 200 Teclados");
    	 }
    	 if(existencia.get("Mouses") <= 0) {
    		 System.out.println("Se crea una solicitu por 200 Mouses");
    	 }
    	 if(existencia.get("Enfriadores") <= 0) {
    		 System.out.println("Se crea una solicitu por 200 Enfriadores");
    	 }
     }
 
   
}