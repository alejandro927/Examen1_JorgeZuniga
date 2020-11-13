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
public class ElMachetero extends  Personas{
    private int PersonasQueDesaparecio;

    public ElMachetero() {
        super();
    }

    public ElMachetero(int PersonasQueDesaparecio) {
        this.PersonasQueDesaparecio = PersonasQueDesaparecio;
    }

    public int getPersonasQueDesaparecio() {
        return PersonasQueDesaparecio;
    }

    public void setPersonasQueDesaparecio(int PersonasQueDesaparecio) {
        this.PersonasQueDesaparecio = PersonasQueDesaparecio;
    }

    @Override
    public String toString() {
        return "PersonasQueDesaparecio=" + PersonasQueDesaparecio ;
    }
    
}
