/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Enums.GeneroJogo;

import Enums.TipoMidia;
import abstratas.Midia;

/**
 *
 * @author lucas
 */
public class Jogo extends Midia{
	
    private GeneroJogo genero;
    private Plataforma plataforma;

    public Jogo(){
        super();
        this.setGenero(GeneroJogo.AC);
        this.setPlataforma(null);
    }
    public Jogo(String nome, TipoMidia tipoMidia, GeneroJogo genero, Plataforma plataforma){
        super(nome, tipoMidia);
        this.setGenero(genero);
        this.setPlataforma(plataforma);
    }

    public void setGenero(GeneroJogo genero) {
        this.genero = genero;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma == null ? new Plataforma() : plataforma;
    }

    public GeneroJogo getGenero() {
        return this.genero;
    }

    public Plataforma getPlataforma() {
        return this.plataforma;
    }
    
    @Override
    public String toString(){
        return this.plataforma + " - " + super.getNome();
    }
    
}