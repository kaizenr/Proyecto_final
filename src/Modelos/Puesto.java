/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 */

//implements Serializable indica que esta clase puede ser Serializada
public class Puesto implements Serializable {
    
    //Atributos de la clase
    private int numero;
    private String tipovehiculo;
    private Vehiculo vehiculo;
    private String estado;
    private LocalDate fechaIngreso;
    private LocalTime horaIngreso;
    private double valorPagar;
    
    public static final String OCUPADO = "Ocupado";
    public static final String DESOCUPADO = "Desocupado";

    public Puesto() {
        this.estado = DESOCUPADO;
    }

    //Constructor(Inicialiaza la clase y crea una nueva Instancia)
    public Puesto(int numero, String tipovehiculo, Vehiculo vehiculo, LocalDate fechaIngreso, double valorPagar) {
        this.numero = numero;
        this.tipovehiculo = tipovehiculo;
        this.vehiculo = vehiculo;
        this.fechaIngreso = fechaIngreso;
        this.valorPagar = valorPagar;
    }
    
    //Modificadores de acceso
      
    //GET Y SET= 
    //Get: Sirve para ver la informacion de cada variable
    //Ser: Sirve para modificar la informacion de cada variable
    public Puesto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
}
