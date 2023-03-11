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
public class Serie extends Midia{

    private int duracaoEpisodio;
    private int qtdeMidias;
    private GeneroFilmeSerie genero;

    public Serie(){
        super();
        this.setDuracaoEpisodio(0);
        this.setQtdeMidias(0);
        this.setGenero(GeneroFilmeSerie.AC);
    }
    public Serie(String nome, TipoMidia tipoMidia, int duracaoEpisodio, int qtdeMidias, GeneroFilmeSerie genero){
        super(nome, tipoMidia);
        this.setDuracaoEpisodio(duracaoEpisodio);
        this.setQtdeMidias(qtdeMidias);
        this.setGenero(genero);
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio <= 0 ? 0 : duracaoEpisodio;
    }

    public void setQtdeMidias(int qtdeMidias) {
        this.qtdeMidias = qtdeMidias <= 0 ? 0 : qtdeMidias;
    }

    public void setGenero(GeneroFilmeSerie genero) {
        this.genero = genero;
    }
    

    public int getDuracaoEpisodio() {
        return this.duracaoEpisodio;
    }

    public int getQtdeMidias() {
        return this.qtdeMidias;
    }

    public GeneroFilmeSerie getGenero() {
        return this.genero;
    }
    

    @Override
    public String toString(){
        return super.getTipoMidia() +" - "+ super.getNome();
    }
}
