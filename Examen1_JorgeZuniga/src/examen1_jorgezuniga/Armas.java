/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_jorgezuniga;

/**
 *
 * @author Alejandro
 */
public class Armas {
    private String tipo;
    private int daño;

    public Armas() {
    }

    public Armas(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Armas{" + "tipo=" + tipo + ", da\u00f1o=" + daño + '}';
    }
    
    
}
