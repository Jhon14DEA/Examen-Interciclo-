/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Controlador;

import ec.ed.ups.Modelo.Curso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class ControladorCurso  extends Controlador<Curso>{

        public ControladorCurso(String ruta) {
        super(ruta);
    }
    public List<Curso> cursos() {

        List<Curso> lista = new ArrayList();
        Curso curso;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            curso = (Curso) i.next();
            lista.add(curso);

        }
        return lista;

    }

    @Override
    public boolean validar(Curso objeto) {
        return true;

    }

    @Override
    public int generarId() {
        List<Curso> temp = new ArrayList();
        for (Curso a : super.getLista()) {
            Curso m = (Curso) a;
            temp.add(m);

        }

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigoCurso() + 1;
        } else {
            return 1;
        }

    }
}
