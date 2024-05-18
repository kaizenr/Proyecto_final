/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 */
public class YaOcupaPuestoException extends RuntimeException{
    
    public YaOcupaPuestoException() {
    super("El vehículo ya ocupa un puesto en el parqueadero");
    }
    
}
//metodo para saber si ya exite un auto guardado
