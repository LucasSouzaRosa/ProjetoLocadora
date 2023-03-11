/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstratas.Item;
import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author lucas
 */
public class OrdemLocacao {
    private int numero;
    private Cliente cliente;
    private LocalDate data;
    private LinkedList<Item> listaItens = new LinkedList();
    
    public OrdemLocacao(){
        this.setNumero(0);
        this.setCliente(null);
        this.setData(LocalDate.now());
    }
    public OrdemLocacao(int numero, Cliente cliente, LocalDate data){
        this.setNumero(numero);
        this.setCliente(cliente);
        this.setData(data);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setListaItens(LinkedList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public LinkedList<Item> getListaItens() {
        return listaItens;
    }

    @Override
    public String toString() {
        return "O.S.: + " + this.numero + " - " + this.cliente;
    }
    
    
    
}
