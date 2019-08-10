package com.calculadora.app.clientes;

import java.util.HashMap;
import java.util.Map;
//César Alejandro Virgen Herrera
//Paola Contreras Lopez
//Miguel Angel Guzman Figueroa

public class CreaClientes {
	private Bclientes ctes;
	private Bclientes ctes2;
	private Bclientes ctes3;
	private Bclientes ctes4;
	
	public CreaClientes() {
		
	}
	
	public HashMap getClientes() {
		ctes = new Bclientes("Agencia Viajes Garza");
		ctes.setDiasPedido(7);
		ctes.setLpatops(30);
		ctes.setMonitores(30);
		ctes.setTeclados(30);
		ctes.setMouses(30);
		
		ctes2 = new Bclientes("Despacho Gonzalez");
		ctes2.setDiasPedido(3);
		ctes2.setLpatops(40);
		ctes2.setMonitores(40);
		
		ctes3 = new Bclientes("UAG");
		ctes3.setDiasPedido(15);
		ctes3.setLpatops(100);
		ctes3.setTeclados(100);
		ctes3.setMouses(100);
		
		ctes4 = new Bclientes("Contadores & Auditores");
		ctes4.setDiasPedido(30);
		ctes4.setLpatops(20);
		
		HashMap<String, Bclientes> clientes = new HashMap<String,Bclientes>();
		
		clientes.put("Cliente1", ctes);
		clientes.put("Cliente2", ctes2);
		clientes.put("Cliente3", ctes3);
		clientes.put("Cliente4", ctes4);
		
		return clientes;
	}

}
