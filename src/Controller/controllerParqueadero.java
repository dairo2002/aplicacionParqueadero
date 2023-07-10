/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Parqueadero;
import Model.Vehiculo;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Dairo Santana
 */
public class controllerParqueadero {
    
    public boolean registroVehiculo(String tipoVehiculo, String placa, LocalDateTime entradaFechaHora){
        return Parqueadero.registroVehiculo(tipoVehiculo, placa, entradaFechaHora);
    } 
    
    public boolean retirarVehiculo(String tipoVehiculo, String placa, LocalDateTime salidaFechaHora){
        return Parqueadero.registroVehiculo(tipoVehiculo, placa, salidaFechaHora);
    }
    
    public Vehiculo consultarSalida(String placa) {
        return Parqueadero.consultarSalida(placa);
    }
    
//    public Vehiculo consultarSalida(String tipoVehiculo, String placa) {
//        return Parqueadero.consultarSalida(tipoVehiculo, placa);
//    }
    
    public double calcularSalida(LocalDateTime entradaFechaHora, LocalDateTime salidaFechaHora){
        return Parqueadero.calcularSalida(entradaFechaHora, salidaFechaHora);
    }
    
    public ArrayList lista(){
        return Parqueadero.lista();
    }
}
