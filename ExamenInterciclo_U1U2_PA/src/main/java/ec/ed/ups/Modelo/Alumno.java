/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Modelo;

/**
 * 
 */
public class Alumno extends  Persona{

    private Curso curso;

    public Alumno(Curso curso, String cedula, String nombre, String apellido, String FechaNacimiento, String correo, String cntraseña) {
        super(cedula, nombre, apellido, FechaNacimiento, correo, cntraseña);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
