/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstratas.Pessoa;

/**
 *
 * @author lucas
 */
public class Cliente extends Pessoa{
    
    private String cpf;
    
    public Cliente(){
        super();
        this.setCpf("000.000.000-00");
    }
    
    public Cliente(String nome, String endereco, String email, String telefone, String cpf) {
        super(nome, endereco, email, telefone);
        this.setCpf(cpf);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "000.000.000-00" : cpf;
    }
    
    
    
    
    
}
