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
public class Fornecedor extends Pessoa{
	
    private String cnpj;

    public Fornecedor(){
            super();
            this.setCnpj("00.000.000/0000-00");
    }

    public Fornecedor(String nome, String endereco, String email, String telefone, String cnpj){
            super(nome, endereco, email, telefone);
            this.setCnpj(cnpj);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj.trim().isEmpty() ? "00.000.000/0000-00" : cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    @Override
    public String toString(){
            return super.getNome();
    }
}
