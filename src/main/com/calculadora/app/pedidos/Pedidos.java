package com.calculadora.app.pedidos;
/* Miguel Angel Guzman Figueroa
* Paola Contreras López
* Cesar Alejandro Virgen Herrera
*/


import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Date;
import com.calculadora.app.inventario.*;
import com.calculadora.app.clientes.*;

public class Pedidos {
	private Inventario inv;
	private Bclientes cliente;
	private Hashtable existencia;
	private Hashtable precios;
	private HashMap clientesPagan;
	

	public Pedidos() {
		inv = new Inventario();
	}

	public Pedidos(Bclientes clientes) {
		cliente = clientes;
		inv = new Inventario();
	}
	
	public Hashtable calcularPedido(Bclientes cte) {
		cliente = cte;
		Hashtable productos = inv.getProductos();
		Hashtable existencia = (Hashtable) productos.get("Existencia");
		Hashtable precios = (Hashtable) productos.get("Precios");
		boolean pedir = false;
		
		double aPagar = 0d;
	    double total = 0d;
	    double dscto = 0d;
	    int ind = 0;
	    String prod = "Producto";
	    String cant = "Cantidad";
	    String tot = "Total";
	    String sub = "SubTotal";
	    Hashtable pedido = new Hashtable();
	    pedido.put("Nombre", cliente.getNameCte());
	    
	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.DAY_OF_MONTH, cliente.getNumDias());
	    pedido.put("FechaEntrega", calendar);
	        
	    if(cliente.getNumLaptops() > 0) {
	      ind++;
	      prod = "Producto";
	      cant = "Cantidad";
	      tot = "Total";
	      sub = "SubTotal";
	      aPagar = 0d;
	      
	      int dif = (Integer) existencia.get("Laptops") - cliente.getNumLaptops();
	      
	      
	      if(dif > 0) {
	        existencia.replace("Laptops", dif);
	        aPagar = aPagar + (cliente.getNumLaptops() * (Integer) precios.get("Laptops"));
	      } else {
	        aPagar = aPagar + (cliente.getNumLaptops() * (Integer) precios.get("Laptops"));
	        dscto = dscto + (aPagar * 0.05);
	        existencia.replace("Laptops", 0);
	        pedir = true;
	      }
	      total = total + aPagar;
	      prod += ind;
	      cant += ind;
	      tot += ind;
	      pedido.put(prod, "Laptops");
	      pedido.put(cant, cliente.getNumLaptops());
	      pedido.put(tot, aPagar);
	    }
	    
	    if(cliente.getNumMonitores() > 0) {
	        ind++;
	        prod = "Producto";
	        cant = "Cantidad";
	        tot = "Total";
	        sub = "SubTotal";
	        aPagar = 0d;
	          
	          int dif = (Integer) existencia.get("Monitores") - cliente.getNumMonitores();
	          
	          if(dif > 0) {
	            existencia.replace("Monitores", dif);
	            aPagar = aPagar + (cliente.getNumMonitores() * (Integer) precios.get("Monitores"));
	          } else {
	        	  existencia.replace("Monitores", 0);
	        	  pedir = true;
	              aPagar = aPagar + (cliente.getNumMonitores() * (Integer) precios.get("Monitores"));
	              dscto = dscto + (aPagar * 0.05);
	          }
	          total = total + aPagar;
	          prod += ind;
	          cant += ind;
	          tot += ind;
	          pedido.put(prod, "Monitores");
	          pedido.put(cant, cliente.getNumMonitores());
	          pedido.put(tot, aPagar); 
	    }
	    
	    if(cliente.getNumTeclados() > 0) {
	        ind++;
	        prod = "Producto";
	        cant = "Cantidad";
	        tot = "Total";
	        sub = "SubTotal";
	        aPagar = 0d;
	          
	          int dif = (Integer) existencia.get("Teclados") - cliente.getNumTeclados();
	          
	          if(dif > 0) {
	            existencia.replace("Teclados", dif);
	            aPagar = aPagar + (cliente.getNumTeclados() * (Integer) precios.get("Teclados"));
	          } else {
	        	  existencia.replace("Teclados", 0);
	        	  pedir = true;
	            aPagar = aPagar + (cliente.getNumTeclados() * (Integer) precios.get("Teclados"));
	            dscto = dscto + (aPagar * 0.05);
	          }
	          total = total + aPagar;
	          prod += ind;
	          cant += ind;
	          tot += ind;
	          pedido.put(prod, "Teclados");
	          pedido.put(cant, cliente.getNumTeclados());
	          pedido.put(tot, aPagar); 
	    }
	    
	    if(cliente.getNumMouses() > 0) {
	        ind++;
	        prod = "Producto";
	        cant = "Cantidad";
	        tot = "Total";
	        sub = "SubTotal";
	        aPagar = 0d;
	          
	          int dif = (Integer) existencia.get("Mouses") - cliente.getNumMouses();
	          
	          if(dif > 0) {
	            existencia.replace("Mouses", dif);
	            aPagar = aPagar + (cliente.getNumMouses() * (Integer) precios.get("Mouses"));
	          } else {
	        	  existencia.replace("Mouses", 0);
	        	  pedir = true;
	            aPagar = aPagar + (cliente.getNumMouses() * (Integer) precios.get("Mouses"));
	            dscto = dscto + (aPagar * 0.05);
	          }
	          total = total + aPagar;
	          prod += ind;
	          cant += ind;
	          tot += ind;
	          pedido.put(prod, "Mouses");
	          pedido.put(cant, cliente.getNumMouses());
	          pedido.put(tot, aPagar);
	    }
	    
	    if(cliente.getNumEnfriadores() > 0) {
	       ind++;
	       prod = "Producto";
	       cant = "Cantidad";
	       tot = "Total";
	       sub = "SubTotal";
	       aPagar = 0d;
	          
	          int dif = (Integer) existencia.get("Enfriadores") - cliente.getNumEnfriadores();
	          
	          if(dif > 0) {
	            existencia.replace("Enfriadores", dif);
	            aPagar = aPagar + (cliente.getNumEnfriadores() * (Integer) precios.get("Enfriadores"));
	          } else {
	        	  existencia.replace("Enfriadores", 0);
	        	  pedir = true;
	            aPagar = aPagar + (cliente.getNumEnfriadores() * (Integer) precios.get("Enfriadores"));
	            dscto = dscto + (aPagar * 0.05);
	          }
	          total = total + aPagar;
	          prod += ind;
	          cant += ind;
	          tot += ind;
	          pedido.put(prod, "Enfriadores");
	          pedido.put(cant, cliente.getNumEnfriadores());
	          pedido.put(tot, aPagar);
	    }
	    
	    if(total >= 100000 && total < 200000) {
			dscto = dscto +  (total * 0.20);
		}
		if(total >= 200000) {
			dscto = dscto + (total * 0.30);
		}
		
	    double totFin = (total - dscto) * 1.16;
	    
	    pedido.put("SubTotal", total);
	    pedido.put("Total", totFin);
	    
	    productos.replace("Existencia", existencia);
	    
	    inv.setProductos(productos);

	    //Se solicitara el faltante de algun producto si el inventario llego a cero o menos.
	    if(pedir) {
	    	inv.solicitoInventario(existencia);
	    }
	    
		return pedido;
	}

	public LinkedList ordenaPedidoClientes(HashMap ctes) {
		clientesPagan = ctes;
		HashMap clientePaga = new HashMap();
		HashMap clienteDescuento = new HashMap();
		int fecha1 = 0;
		int fecha2 = 0;
		
		
		LinkedList ordenClientes = new LinkedList();
		
		for(int x = 1; x < ctes.size(); x++) {
			String ind = "Cliente";
			ind += x;

			cliente = (Bclientes) ctes.get(ind);
			
			if(x == 1) {
				ordenClientes.addFirst(cliente);
				fecha1 = cliente.getNumDias();
			} else {
				fecha2 = cliente.getNumDias();
				if(fecha2 < fecha1) {
					ordenClientes.addFirst(cliente);
				} else {
					ordenClientes.addLast(cliente);
					fecha1 = fecha2;
				}
			}			
		}
		
		return ordenClientes;

	}


}