/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;

/**
 *
 */
public class Carro extends Vehiculo implements Serializable{

    public Carro(String placa, String modelo, Propietario propietario) {
        super(placa, modelo, propietario);
    }  
}
