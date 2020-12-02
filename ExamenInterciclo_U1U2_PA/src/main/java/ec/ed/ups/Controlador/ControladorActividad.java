/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Controlador;

import ec.ed.ups.Modelo.Actividad;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class ControladorActividad extends Controlador<Actividad> {
    
    private Pattern patron;
    private Matcher corpus;
    
    public ControladorActividad(String ruta) {
        super(ruta);
    }    

  
    
    @Override
    public boolean validar(Actividad obj) {
        return true;
    }

    @Override
    public int generarId() {
        return 0;
    }
     public void ingresarRegex(String regex){
    patron = Pattern.compile(regex);
    }
    public boolean validar (String Texto){
        corpus = patron.matcher(Texto);
        return corpus.find();
    }

    public List<String> obtenerListaAplicacion(String texto){
    
        List<String> resultado = new ArrayList<>();
        while (corpus.find()) {
            for (int i = 0; i < corpus.groupCount(); i++) {
                resultado.add(corpus.group(i));
            }
            
        }
        return resultado;                
    }
    
    
    public Pattern getPatron() {
        return patron;
    }

    public void setPatron(Pattern patron) {
        this.patron = patron;
    }

    public Matcher getCorpus() {
        return corpus;
    }

    public void setCorpus(Matcher corpus) {
        this.corpus = corpus;
    }
  

}
