/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcial;

/**
 *
 * @author pc
 */
public class Empresa {
    private String cif;
    private Direccion direccion;
    
    public Direccion getDireccion(){
        return direccion;
    }
    public void setDireccion(Direccion diteccion){
        this.direccion = direccion;
    }
    public String getCif(){
        return cif;
    }
    public void setCif(String cif){
        this.cif = cif;
    }
}
