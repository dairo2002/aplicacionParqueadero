/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dairo Santana
 */
public class Login {
    
    public static boolean login(String usuario, String contrasena) {
        Usuario login = new Usuario();
        if (login.getUsuario().equals(usuario) && login.getContrasena().equals(contrasena)) {
            return true;
        } else {
            return false;
        }
    }

}
