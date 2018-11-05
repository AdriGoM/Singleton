/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author adriangodoymartinez
 */
public class Sesion {
    private static Sesion sesion;
    private String usuario;
    
    private Sesion() { }
    
    public static Sesion getInstance() {
        if(sesion == null) {
            sesion = new Sesion();
        }
        return sesion;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
