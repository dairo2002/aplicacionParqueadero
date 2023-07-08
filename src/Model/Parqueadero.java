/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parqueadero {

    public static ArrayList<Vehiculo> listaV = new ArrayList<>();

    public static boolean registroVehiculo(String tipoVehiculo, String placa, LocalDateTime entradaFechaHora) {
        boolean vehiculoExiste = true;
        for (Vehiculo V : listaV) {
            if (V.getTipoVehiculo().equals(tipoVehiculo) && V.getPlaca().equals(placa)) {
                vehiculoExiste = false;
                System.out.println("Ya existe este placa");
            }
        }
        if (vehiculoExiste) {
            try {
                Vehiculo vehi = new Vehiculo();
                vehi.setTipoVehiculo(tipoVehiculo);
                vehi.setPlaca(placa);
                vehi.setEntradaFechaHora(entradaFechaHora);
                listaV.add(vehi);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return vehiculoExiste;
    }

//    public static Vehiculo consultarSalida(String tipoVehiculo, String placa) {
//        for (Vehiculo vehiculo : listaV) {
//            if (vehiculo.getPlaca().equals(placa)) {
//                vehiculo.setSalidaFechaHora(LocalDateTime.now());
//                return vehiculo;
//            }
//        }
//        return null;
//    }
    
    public static Vehiculo consultarSalida(String placa) {
        for (Vehiculo vehiculo : listaV) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculo.setSalidaFechaHora(LocalDateTime.now());
                return vehiculo;
            }
        }
        return null;
    }

    public static double calcularSalida(String tipoVehiculo, LocalDateTime entradaFechaHora, LocalDateTime salidaFechaHora) {
        //Corregir que solo se pueda escoger el vehiculo correcto y retirar que con su costo
        //Segun el vehiculo que seleccione se debe pagar 
        //Si registro carro, solo puedo sacar el carro
        Duration duracion = Duration.between(entradaFechaHora, salidaFechaHora);
        long hora = duracion.toHours();
        long minuto = duracion.toMinutes() - (hora * 60);
        long pagar = 0;
        for (Vehiculo vehi : listaV) {
            if (vehi.getTipoVehiculo().equals("Moto")) {
                if (minuto > 30) {
                    hora++;
                    pagar = 1500 * hora;
                } else if (hora == 0 && minuto <= 30) {
                    pagar = 700;
                }
            } else if (vehi.getTipoVehiculo().equals("Carro")) {
                if (minuto > 30) {
                    hora++;
                    pagar = 2500 * hora;
                } else if (hora == 0 && minuto <= 30) {
                    pagar = 1500;
                }
            }
        }

        return pagar;

    }

    public static ArrayList lista() {
        return listaV;
    }

}
