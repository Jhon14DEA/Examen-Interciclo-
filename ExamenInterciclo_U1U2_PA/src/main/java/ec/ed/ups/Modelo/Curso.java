/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Modelo;

/**
 * 
 */
public class Curso {

    private int  codigoCurso;
    private String nivel;

    public Curso(int codigoCurso, String nivel) {
        this.codigoCurso = codigoCurso;
        this.nivel = nivel;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigoCurso;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.codigoCurso != other.codigoCurso) {
            return false;
        }
        return true;
    }

    
    
    
}
