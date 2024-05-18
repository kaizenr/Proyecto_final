
package Singleton;

import Modelos.Puesto;
import Modelos.Tarifas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 */

//Singleton es un patron de diseño que permite guarda informacion en memoria
//Crea una unica instancia y permite almacenar todo alli
public class Singleton {
    
    private static Singleton INSTANCIA = new Singleton();
    
    //Tiene tres listas
    Puesto[][] puestos;
    ArrayList<Tarifas> tarifas;
    ArrayList<Puesto> listaRegistro;
    
    private Singleton(){
        puestos = leerCasillas();
        tarifas = leerTarifas();
        listaRegistro = leerRegistro();
    }
    
    public static Singleton getInstancia(){
        return INSTANCIA;
    }

    public Puesto[][] getCasillas(){
        return puestos;
    }
    
    public ArrayList<Tarifas> getListaTarifas() {
        return tarifas;
    }  
    
    public ArrayList<Puesto> getListaRegistro() {
        return listaRegistro;
    }  
    
    //Se compone de dos metodos 
    
    //Leer que permite buscar la informacion que tenemos guardada en dicho archivosrc/Singleton/Puestos.dat
    
    public Puesto[][] leerCasillas(){
        try{
            FileInputStream archivo = new FileInputStream("src/Singleton/Puestos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Puesto[][]) lector.readObject();
        }catch (IOException | ClassNotFoundException e) {
            Puesto[][] aux = new Puesto[4][6];
            for (int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[i].length; j++) {
                    aux[i][j] = new Puesto();                
                }            
            }
            return aux;
        }
    }
    
    //Escribir que permite estar actualizando la informacion constantemente ya sea cuando se guarda, elimina, edita algun tipo de dato

    public void escribirCasillas(){
        try {
            FileOutputStream archivo = new FileOutputStream("src/Singleton/Puestos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(puestos);
        } catch (IOException e) {
        }
    }
    
    public void escribir(){
        try {
            FileOutputStream archivo = new FileOutputStream("src/Singleton/Tarifas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(this.tarifas);
        } catch (IOException ex) {
        }
    }
    
    private ArrayList<Tarifas> leerTarifas() {
        try {
            FileInputStream archivo = new FileInputStream("src/Singleton/Tarifas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Tarifas>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
    
    public void escribirListaRegistro(){
        try {
            FileOutputStream archivo = new FileOutputStream("src/Singleton/historialRegistro.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(this.listaRegistro);
        } catch (IOException ex) {
        }
    }
    
    private ArrayList<Puesto> leerRegistro() {
        try {
            FileInputStream archivo = new FileInputStream("src/Singleton/historialRegistro.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Puesto>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
}
