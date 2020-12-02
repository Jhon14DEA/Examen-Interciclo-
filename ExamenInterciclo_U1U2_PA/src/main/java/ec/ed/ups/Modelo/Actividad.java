/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Modelo;

/**
 * 
 */
public class Actividad {

    private int codigoAct;
    private String tituloAct;
    private String descripcionAct;
    private String link;
    private String curso;

    public Actividad(int codigoAct, String tituloAct, String descripcionAct, String link, String curso) {
        this.codigoAct = codigoAct;
        this.tituloAct = tituloAct;
        this.descripcionAct = descripcionAct;
        this.link = link;
        this.curso = curso;
    }

    public int getCodigoAct() {
        return codigoAct;
    }

    public void setCodigoAct(int codigoAct) {
        this.codigoAct = codigoAct;
    }

    public String getTituloAct() {
        return tituloAct;
    }

    public void setTituloAct(String tituloAct) {
        this.tituloAct = tituloAct;
    }

    public String getDescripcionAct() {
        return descripcionAct;
    }

    public void setDescripcionAct(String descripcionAct) {
        this.descripcionAct = descripcionAct;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.codigoAct;
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
        final Actividad other = (Actividad) obj;
        if (this.codigoAct != other.codigoAct) {
            return false;
        }
        return true;
    }
}
