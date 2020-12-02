/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ed.ups.Controlador;
 import java.util.regex.*;
/**
 * 
 */
public class ControladorRgx {
    
    private Pattern patron;
    private Matcher corpus;
    public void ingresarRegex(String regex){
    patron = Pattern.compile(regex);
    }
    public boolean validar (String Texto){
        corpus = patron.matcher(Texto);
        return corpus.find();
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
