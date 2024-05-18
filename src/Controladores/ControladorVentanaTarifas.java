
package Controladores;

import Modelos.Puesto;
import Modelos.Tarifas;
import Singleton.Singleton;
import java.util.ArrayList;
//aqui se pone el precio 
/**
 *
 */
public class ControladorVentanaTarifas {
    
    private ArrayList<Tarifas> tarifas;
    
    public ControladorVentanaTarifas(){ 
        this.tarifas = Singleton.getInstancia().getListaTarifas(); 
    }

    public void tarifasCrear() {
        boolean isEmptyOrNull = true;
        for (Tarifas tarifa : tarifas) {
            if (tarifa != null) {
                isEmptyOrNull = false;
                break;
            }
        }
        
        if (isEmptyOrNull) {
            Tarifas tarifas1 = new Tarifas("Carro", "3000");
            Tarifas tarifas2 = new Tarifas("Hibrida", "5000");
            Tarifas tarifas3 = new Tarifas("Clasica", "2000");

            this.tarifas.add(tarifas1);
            this.tarifas.add(tarifas2);
            this.tarifas.add(tarifas3);
            Singleton.getInstancia().escribir();
        }
    }


    public Tarifas obtenerTarifaCarro(){
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if(tarifa.getTipo().equals("Carro")){
                return tarifa;
            }            
        }
        return null;
    }
    
    public Tarifas obtenerTarifaHibrida(){
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if(tarifa.getTipo().equals("Hibrida")){
                return tarifa;
            } 
        }
        return null;
    }
    
     public Tarifas obtenerTarifaClasica(){
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if(tarifa.getTipo().equals("Clasica")){
                return tarifa;
            } 
        }
        return null;
    }
    
    public void actualizarTarifaHibrida(String valor){
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if(tarifa != null && tarifa.getTipo().equals("Hibrida")){
                tarifa.setValor(valor);
                Singleton.getInstancia().escribir();
                break;
            }
        }
    }
    
    public void actualizarTarifaClasica(String valor){
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if(tarifa != null && tarifa.getTipo().equals("Clasica")){
                tarifa.setValor(valor);
                Singleton.getInstancia().escribir();
                break;
            }
        }
    }
    
    public void actualizarTarifaCarro(String valor){
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if(tarifa != null && tarifa.getTipo().equals("Carro")){
                tarifa.setValor(valor);
                Singleton.getInstancia().escribir();
                break;
            }
        }
    }    
    
    public double valor(Puesto puesto) {
        double valor = 0;
        for (int i = 0; i < tarifas.size(); i++) {
            Tarifas tarifa = tarifas.get(i);
            if (tarifa.getTipo().equals("Clasica")) {
                if (puesto.getTipovehiculo().equals("Clasica")) {
                    valor = convertirValor(tarifa.getValor());
                }
            } else if (tarifa.getTipo().equals("Hibrida")) {
                if (puesto.getTipovehiculo().equals("Hibrida")) {
                    valor = convertirValor(tarifa.getValor());
                }
            } else {
                if (puesto.getTipovehiculo().equals("Carro")) {
                    valor = convertirValor(tarifa.getValor());
                }
            }
        }
        return valor;
    }

    private double convertirValor(String valorStr) {
        try {
            return Double.parseDouble(valorStr);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
