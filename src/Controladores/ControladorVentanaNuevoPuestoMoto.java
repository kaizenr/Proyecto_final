/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Excepciones.YaOcupaPuestoException;
import Modelos.Puesto;
import Modelos.Vehiculo;
import Singleton.Singleton;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 */
public class ControladorVentanaNuevoPuestoMoto {
    
    Puesto[][] puestos;
    
    public ControladorVentanaNuevoPuestoMoto(){ 
        puestos = Singleton.getInstancia().getCasillas(); 
    }
    
    public Puesto obtenerCasilla(int fila, int columna){
        return puestos[fila][columna];
    }
    
    public boolean validarPlaca(String placa) {
        for (Puesto[] filaPuestos : Singleton.getInstancia().getCasillas()) {
            for (Puesto puesto : filaPuestos) {
                if (puesto != null && puesto.getVehiculo()!= null) {
                    if (puesto.getVehiculo().getPlaca().equals(placa)) {
                        return true;
                    }
                }
            }
        }
        return false;
    } 
    
    public void agregarPuesto(int fila, int columna, Vehiculo moto, int numero, LocalDate fecha, LocalTime horaActual, String tipo) {
        boolean validar = validarPlaca(moto.getPlaca());
        if(validar == false){
            Puesto puesto = new Puesto();
            puesto.setEstado(Puesto.OCUPADO);
            puesto.setNumero(numero);
            puesto.setVehiculo(moto);
            puesto.setFechaIngreso(fecha);
            puesto.setHoraIngreso(horaActual);
            puesto.setTipovehiculo(tipo);
            puestos[fila][columna] = puesto;
            Singleton.getInstancia().escribirCasillas();
        }else {
            throw new YaOcupaPuestoException();
        }
    }
}
