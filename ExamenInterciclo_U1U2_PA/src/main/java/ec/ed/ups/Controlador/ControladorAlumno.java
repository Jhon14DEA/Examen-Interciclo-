/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Controlador;

import ec.ed.ups.Modelo.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class ControladorAlumno extends Controlador<Alumno>{

    private ControladorPersona controladoPersona;

    public ControladorAlumno(ControladorPersona controladorPersona, String ruta) {
        super(ruta);
        this.controladoPersona = controladorPersona;
    }
        public List<Alumno> alumnos() {
        List<Alumno> lista = new ArrayList();
        Alumno alumno;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            alumno = (Alumno) i.next();
            lista.add(alumno);

        }
        return lista;

    }
    @Override
    public boolean validar(Alumno obj) {
        return controladoPersona.validar(obj);
    }
    
     @Override
    public int generarId() {
        return 0;

    }


}
