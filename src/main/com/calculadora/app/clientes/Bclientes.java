package com.calculadora.app.clientes;

import java.util.HashMap;
import java.util.Map;

//César Alejandro Virgen Herrera
//Paola Contreras Lopez
//Miguel Angel Guzman Figueroa

public class Bclientes{
    private int numLaptops = 0;
    private int numMonitores = 0;
    private int numTeclados = 0;
    private int numMouses = 0;
    private int numDias = 0;
    private int numEnfriadores = 0;
    private String nameCte = "";

    public Bclientes(String nameCte){
        setNameCte(nameCte);
    }

    public String getNameCte(){
        return this.nameCte;
    }
    public void setNameCte(String nameCte){
        this.nameCte = nameCte;
    }
    public int getNumLaptops(){
        return this.numLaptops;

    }
    public void setLpatops(int numLaptops){
        this.numLaptops = numLaptops;
    }
    public int getNumMonitores(){
        return this.numMonitores;

    }
    public void setMonitores(int numMonitores){
        this.numMonitores = numMonitores;
    }
    public int getNumTeclados(){
        return this.numTeclados;
    }
    public void setTeclados(int numTeclados){
        this.numTeclados = numTeclados;
    }
    public int getNumMouses(){
        return this.numMouses;
    }
    public void setMouses(int numMouses){
        this.numMouses = numMouses;
    }
    public int getNumDias(){
        return this.numDias;
    }
    public void setDiasPedido(int numDias){
        this.numDias = numDias;
    }
    public int getNumEnfriadores(){
        return this.numEnfriadores;
    }
    public void setNumEnfriadores(int numEnfriadores){
        this.numEnfriadores = numEnfriadores;
    }
}