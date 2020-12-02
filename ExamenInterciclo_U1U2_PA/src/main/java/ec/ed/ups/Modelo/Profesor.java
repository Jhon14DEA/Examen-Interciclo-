/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Modelo;

/**
 * 
 */
public class Profesor extends Persona{

    private String profesion ;
   // private String correo ;
   // private String contrasena;
/*
    public Profesor(String profesion, String correo, String contrasena, String cedula, String nombre, String apellido, String FechaNacimiento, String correo, String cntraseña) {
        super(cedula, nombre, apellido, FechaNacimiento, correo, cntraseña);
        this.profesion = profesion;
        this.correo = correo;
        this.contrasena = contrasena;
    }
*/
    public Profesor(String profesion, String cedula, String nombre, String apellido, String FechaNacimiento, String correo, String cntraseña) {
        super(cedula, nombre, apellido, FechaNacimiento, correo, cntraseña);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
    
    
    
}
