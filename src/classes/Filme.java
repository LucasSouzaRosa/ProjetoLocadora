/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Enums.GeneroFilmeSerie;
import Enums.TipoMidia;
import abstratas.Midia;

/**
 *
 * @author lucas
 */
public class Filme extends Midia{
	
    private GeneroFilmeSerie genero;
    private int duracao;

    public Filme(){
            super();
            this.setGenero(GeneroFilmeSerie.AC);
            this.setDuracao(0);
    }
    public Filme(String nome, TipoMidia tipoMidia, GeneroFilmeSerie genero, int duracao){
            super(nome, tipoMidia);
            this.setGenero(genero);
            this.setDuracao(duracao);
    }

    public void setGenero(GeneroFilmeSerie genero) {
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao <= 0 ? 0 : duracao;
    }

    public GeneroFilmeSerie getGenero() {
        return genero;
    }

    public int getDuracao() {
        return this.duracao;
    }
    
    @Override
    public String toString(){
            return super.getTipoMidia() + " - " + super.getNome();
    }
}
