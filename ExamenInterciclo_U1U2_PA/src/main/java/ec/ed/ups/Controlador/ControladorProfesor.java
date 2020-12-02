/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Controlador;

import ec.ed.ups.Modelo.Profesor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class ControladorProfesor  extends Controlador<Profesor>{

     private ControladorPersona controlador;
    

    public ControladorProfesor(String ruta, ControladorPersona controlador) {
        super(ruta);
        this.controlador = controlador;
    }
    public List<Profesor> profesor() {

        List<Profesor> lista = new ArrayList();
        Profesor profesor;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            profesor = (Profesor) i.next();
            lista.add(profesor);

        }
        return lista;

    }

    @Override
    public boolean validar(Profesor  obj) {
        return controlador.validar(obj);

    }

    @Override
    public int generarId() {
        return 0;

    }
}
