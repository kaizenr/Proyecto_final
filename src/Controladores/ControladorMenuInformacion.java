
package Controladores;

import Modelos.Puesto;
import Singleton.Singleton;
import java.util.ArrayList;

//este es el menu que se muestra al inicio 
/**
 *
 */
public class ControladorMenuInformacion {
    
    private Puesto puesto;
    private ArrayList<Puesto> listaRegistro;

    
    public ControladorMenuInformacion(Puesto puesto) {
        this.puesto = puesto;
        this.listaRegistro = Singleton.getInstancia().getListaRegistro();
    }
    
    public void desocuparPuesto() {
        puesto.setEstado("Desocupado");
        Singleton.getInstancia().escribirCasillas();    
    }
    
    public void actualizarInfo(Puesto puesto, double valor){      
        Puesto puestoNuevo = new Puesto(puesto.getNumero(), puesto.getTipovehiculo(), puesto.getVehiculo(), puesto.getFechaIngreso(), valor);
        listaRegistro.add(puestoNuevo);
        Singleton.getInstancia().escribirListaRegistro();
    }
}
