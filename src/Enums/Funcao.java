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
public enum Funcao {
    AT("Atendente"),
    SG("Serviços gerais"),
    GE("Gerente"),
    AJ("Ajudante");

    private String descricao;

    private Funcao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return this.descricao;
    }
}
