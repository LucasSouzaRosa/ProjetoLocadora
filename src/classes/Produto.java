/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import abstratas.Item;

/**
 *
 * @author lucas
 */
public class Produto extends Item{

    private double preco;

    public Produto(){
        super();
        this.setPreco(0.0);
        
    }

    public Produto(String nome, double preco){
        super(nome);
        this.setPreco(preco);
    }

        
    public void setPreco(double preco){
        this.preco = preco <= 0 ? 0 : preco;
    }


    public double getPreco(){
        return this.preco;
    }
    


    @Override
    public String toString(){
        return super.getNome() + " - R$ " + this.preco;
    }
	
}
