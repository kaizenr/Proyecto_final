/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Puesto;
import Singleton.Singleton;

/**
 *
 */
public class ControladorVentanaOcuparPuesto {
    
    Puesto[][] puestos;
    
    public ControladorVentanaOcuparPuesto() {
        puestos = Singleton.getInstancia().getCasillas();
    }

    public Puesto obtenerCasilla(int fila, int columna) {
        return puestos[fila][columna];
    }
}
