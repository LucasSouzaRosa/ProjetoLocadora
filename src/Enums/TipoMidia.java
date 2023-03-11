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
public enum TipoMidia {
    BL("Blu-Ray"),
    CD("CD"),
    DVD("DVD"),
    CAR("Cartucho"),
    VHS("VHS");

    private String descricao;

    private TipoMidia(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return this.descricao;
    }    
}
