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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Sesion name = Sesion.getInstance();
       name.setUsuario("Adrián");
       System.out.println(name.getUsuario());
       
       Sesion name2 = Sesion.getInstance();
       System.out.println(name2.getUsuario());
       
    }
    
}
