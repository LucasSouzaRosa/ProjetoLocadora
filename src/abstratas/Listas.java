/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

import classes.Cliente;
import classes.Filme;
import classes.Fornecedor;
import classes.Funcionario;
import classes.Jogo;
import classes.OrdemLocacao;
import classes.Plataforma;
import classes.Produto;
import classes.Serie;
import java.util.LinkedList;

/**
 *
 * @author lucas
 */
abstract public class Listas {
    private static LinkedList<Cliente> listaCliente = new LinkedList<>();
    private static LinkedList<Filme> listaFilme = new LinkedList<>();
    private static LinkedList<Fornecedor> listaFornecedor = new LinkedList<>();
    private static LinkedList<Funcionario> listaFuncionario = new LinkedList<>();
    private static LinkedList<Jogo> listaJogo = new LinkedList<>();
    private static LinkedList<OrdemLocacao> listaOrdemLocacao = new LinkedList<>();
    private static LinkedList<Plataforma> listaPlataforma = new LinkedList<>();
    private static LinkedList<Produto> listaProduto = new LinkedList<>();
    private static LinkedList<Serie> listaSerie = new LinkedList<>();

    public static LinkedList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public static LinkedList<Filme> getListaFilme() {
        return listaFilme;
    }

    public static LinkedList<Fornecedor> getListaFornecedor() {
        return listaFornecedor;
    }

    public static LinkedList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public static LinkedList<Jogo> getListaJogo() {
        return listaJogo;
    }

    public static LinkedList<OrdemLocacao> getListaOrdemLocacao() {
        return listaOrdemLocacao;
    }

    public static LinkedList<Plataforma> getListaPlataforma() {
        return listaPlataforma;
    }

    public static LinkedList<Produto> getListaProduto() {
        return listaProduto;
    }

    public static LinkedList<Serie> getListaSerie() {
        return listaSerie;
    }
    
    
    
}
