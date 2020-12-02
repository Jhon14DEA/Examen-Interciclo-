/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Modelo;

/**
 * 
 */
public class Rector  extends Persona{

    private Profesor profesor;
    private String cargo;
   //private String correo;
   //private String contraseña;

    public Rector(Profesor profesor, String cargo, String cedula, String nombre, String apellido, String FechaNacimiento, String correo, String contraseña) {
        super(cedula, nombre, apellido, FechaNacimiento, correo, contraseña);
        this.profesor = profesor;
        this.cargo = cargo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
