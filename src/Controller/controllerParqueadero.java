/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.modelParqueadero;
import Model.modelVehiculo;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Dairo Santana
 */
public class controllerParqueadero {
    
    public boolean registroVehiculo(String tipoVehiculo, String placa, LocalDateTime entradaFechaHora){
        return modelParqueadero.registroVehiculo(tipoVehiculo, placa, entradaFechaHora);
    } 
    
    public boolean retirarVehiculo(String tipoVehiculo, String placa, LocalDateTime salidaFechaHora){
        return modelParqueadero.registroVehiculo(tipoVehiculo, placa, salidaFechaHora);
    }
    
    public modelVehiculo consultarSalida(String tipoVehiculo, String placa) {
        return modelParqueadero.consultarSalida(tipoVehiculo, placa);
    }
    
    public double calcularSalida(String tipoVehiculo, LocalDateTime entradaFechaHora, LocalDateTime salidaFechaHora){
        return modelParqueadero.calcularSalida(tipoVehiculo, entradaFechaHora, salidaFechaHora);
    }
    
    public ArrayList lista(){
        return modelParqueadero.lista();
    }
}
