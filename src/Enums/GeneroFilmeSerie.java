/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author lucas
 */
public enum GeneroFilmeSerie {
    AC("Ação"),
    CM("Comédia"),
    RO("Romance"),
    DR("Drama"),
    FC("Ficção Ciêntifica"),
    DO("Documentário"),
    MU("Musical"),
    SH("Show"),
    TE("Terror"),
    PO("Policial"),
    SU("Suspense"),
    FA("Fantasia"),
    AN("Anime");

    private String descricao;

    private GeneroFilmeSerie(String descricao){
            this.descricao = descricao;
    }

    @Override
    public String toString(){
            return this.descricao;
    }
}
