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
    
    public Vehiculo consultarSalida(String placa) {
        return Parqueadero.consultarSalida(placa);
    }
    
    public double calcularSalida(LocalDateTime entradaFechaHora, LocalDateTime salidaFechaHora){
        return Parqueadero.calcularSalida(entradaFechaHora, salidaFechaHora);
    }
    
    //Prueba
    public double Salida(LocalDateTime entradaFechaHora, LocalDateTime salidaFechaHora, long precio){
        return Parqueadero.Salida(entradaFechaHora, salidaFechaHora, precio);
    }
    
    public ArrayList lista(){
        Parqueadero p =new Parqueadero();
        return p.lista();
    }
}
