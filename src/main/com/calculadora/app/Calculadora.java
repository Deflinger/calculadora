package com.calculadora.app;
/* Miguel Angel Guzmán Figueroa
* Paola Contreras López
* Cesar Alejandro Virgen Herrera
*/

import java.text.DecimalFormat;
import java.util.*;
import com.calculadora.app.inventario.*;
import com.calculadora.app.clientes.*;
import com.calculadora.app.pedidos.*;

public class Calculadora {
	private Pedidos ped;
	private CreaClientes creaCliente;
	private Bclientes ctes;
	private Inventario inv;

	public Calculadora() {
		ped = new Pedidos();
		creaCliente = new CreaClientes();
		inv = new Inventario();
		
		prosesoPrincipal();
	}
	
	private void prosesoPrincipal() {
		HashMap clientes = creaCliente.getClientes();
		LinkedList ctesOrden = ped.ordenaPedidoClientes(clientes);
		Hashtable cliente = new Hashtable();
		DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
		
		Iterator<Bclientes> listaClientes = ctesOrden.iterator();
		
		while(listaClientes.hasNext()) {
			ctes = listaClientes.next();
			cliente = ped.calcularPedido(ctes);
			Hashtable precios = (Hashtable) inv.getProductos().get("Precios");
			String producto = "";
			String producto2 = "";
			
			if(cliente.size() >= 7) {
				producto = (String) cliente.get("Producto1");
				producto2 = producto;
				
				if(producto.length() < 9) {
					int dif = 9 - producto.length();
					for(int x = 0; x < dif; x++) {
						producto += " ";
					}
				}
				Calendar cal = (Calendar) cliente.get("FechaEntrega");
				String dia, mes, year, fecha;
				dia = new Integer(cal.get(Calendar.DATE)).toString();
				mes = new Integer(cal.get(Calendar.MONTH)).toString();
				year = new Integer(cal.get(Calendar.YEAR)).toString();

				fecha = dia + "/" + mes + "/" + year; //Monitores 9 
				
				System.out.println("Cliente: " + cliente.get("Nombre") + " FechaEntrega: " + fecha);
				System.out.println();
				System.out.println("Producto    Cantidad    Precio    Total");
				//System.out.println("Producto: " + cliente.get("Producto1") + " Cantidad: " + df2.format((Integer) cliente.get("Cantidad1")) + " Total: " + df2.format((Double) cliente.get("Total1"))); 
				System.out.println(producto + "     " + df2.format((Integer) cliente.get("Cantidad1")) + "   " + df2.format((Integer) precios.get(producto2)) + "  " + df2.format((Double) cliente.get("Total1")));
			}
			
			if(cliente.size() >= 10) {
				producto = (String) cliente.get("Producto2");
			//	System.out.println("Largo: " + producto.length());
				producto2 = producto;
				if(producto.length() < 9) {
					int dif = 9 - producto.length();
					for(int x = 0; x < dif; x++) {
						producto += " ";
					}
				}
				System.out.println(producto + "     " + df2.format((Integer) cliente.get("Cantidad2")) + "   " + df2.format((Integer) precios.get(producto2)) + "  " + df2.format((Double) cliente.get("Total2")));
			}
			
			if(cliente.size() >= 13) {
				producto = (String) cliente.get("Producto3");
				producto2 = producto;
				if(producto.length() < 9) {
					int dif = 9 - producto.length();
					for(int x = 0; x < dif; x++) {
						producto += " ";
					}
				}
				System.out.println(producto + "     " + df2.format((Integer) cliente.get("Cantidad3")) + "   " + df2.format((Integer) precios.get(producto2)) + "  " + df2.format((Double) cliente.get("Total3")));
			}
			
			if(cliente.size() >= 16) {
				producto = (String) cliente.get("Producto4");
				producto2 = producto;
				if(producto.length() < 9) {
					int dif = 9 - producto.length();
					for(int x = 0; x < dif; x++) {
						producto += " ";
					}
				}
				System.out.println(producto + "     " + df2.format((Integer) cliente.get("Cantidad4")) + "   " + df2.format((Integer) precios.get(producto2)) + "  " + df2.format((Double) cliente.get("Total4")));
			}
			
			if(cliente.size() >= 19) {
				producto = (String) cliente.get("Producto5");
				producto2 = producto;
				if(producto.length() < 9) {
					int dif = 9 - producto.length();
					for(int x = 0; x < dif; x++) {
						producto += " ";
					}
				}
				System.out.println(producto + "     " + df2.format((Integer) cliente.get("Cantidad5")) + "   " + df2.format((Integer) precios.get(producto2)) + "  " + df2.format((Double) cliente.get("Total5")));
			}
			
			System.out.println("===================================================================================================");
			System.out.println("Sub Total: " + df2.format(cliente.get("SubTotal")));
			System.out.println("Total    : " + df2.format(cliente.get("Total")));
			System.out.println();
			System.out.println("===================================================================================================");
		}
		
	}


	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

	}
}
