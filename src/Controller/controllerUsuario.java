/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Login;

public class controllerUsuario {
    
    public boolean login(String usuario, String contrasena) {
        return Login.login(usuario, contrasena);
    }
}
