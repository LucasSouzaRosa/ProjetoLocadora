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
public enum GeneroJogo {
    AC("Ação"),
    FPS("FPS"),
    RTS("RTS"),
    SI("Simulação"),
    RPG("RPG"),
    ES("Esportes"),
    CO("Corrida"),
    AV("Aventura");

    private String descricao;

    private GeneroJogo(String descricao){
            this.descricao = descricao;
    }

    @Override
    public String toString(){
            return this.descricao;
    }   
}
