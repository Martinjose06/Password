/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LUCYLEONOR
 */
public class Password {
    private String contraseña;
    private int longitud = 8;

    public Password(String contraseña, int longitud) {
        this.contraseña = contraseña;
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String Fuerte(){
        String res;
        if (this.getLongitud() >= 8) {
            res = "Su contraseña es fuerte";
        }
        else{
            res = "Su contraseña es debil, se recomienda cambiar";
        }
        return res;
    }
    
    
    public String mostrar(){
        String res;
        res = "Su contraseña es: "+this.getContraseña();
        return res;
    }
    
    public void cambiar(String n){
       this.setContraseña(n);
    }

   
    
}
