/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Puesto;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 */
public class ControladorVentanaHistorial {
    
    private ArrayList<Puesto> listaRegistros;

    public ControladorVentanaHistorial() {
        this.listaRegistros = Singleton.getInstancia().getListaRegistro();
    }
    
    public ArrayList<Puesto> obtenerPuestos( ){
        
        ArrayList<Puesto> listaPuestos = new ArrayList<>();
        
        if(listaRegistros != null){
            for (int i = 0; i < listaRegistros.size(); i++) {
                Puesto puesto = listaRegistros.get(i);
                listaPuestos.add(puesto);              
            }
            return listaPuestos;  
        }
        return new ArrayList<>(); 
    }
    
    
    
    
}
