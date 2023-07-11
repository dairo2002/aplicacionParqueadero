/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Dairo Santana
 */
public class Vehiculo {

    private String tipoVehiculo;
    private String Placa;
    private LocalDateTime entradaFechaHora;
    private LocalDateTime salidaFechaHora;
    private long precio;
    
    
    public boolean bandera;
    //Hacer las Banderas
    
    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public LocalDateTime getEntradaFechaHora() {
        return entradaFechaHora;
    }

    public void setEntradaFechaHora(LocalDateTime entradaFechaHora) {
        this.entradaFechaHora = entradaFechaHora;
    }

    public LocalDateTime getSalidaFechaHora() {
        return salidaFechaHora;
    }

    public void setSalidaFechaHora(LocalDateTime salidaFechaHora) {
        this.salidaFechaHora = salidaFechaHora;
    }
    




    
}
