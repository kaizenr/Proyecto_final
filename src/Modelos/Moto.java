/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;

/**
 *
 */
public class Moto extends Vehiculo implements Serializable {
    
    private String tipo;
    private String velocidadMax;

    public Moto(String tipo, String velocidadMax, String placa, String modelo, Propietario propietario) {
        super(placa, modelo, propietario);
        this.tipo = tipo;
        this.velocidadMax = velocidadMax;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
}
