/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

import Enums.Funcao;
import Enums.GeneroFilmeSerie;
import Enums.GeneroJogo;
import Enums.TipoMidia;
import classes.Cliente;
import classes.Filme;
import classes.Fornecedor;
import classes.Funcionario;
import classes.Jogo;
import classes.Plataforma;
import classes.Produto;
import classes.Serie;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author lucas
 */
abstract public class PopularListas {
    public static void addDados() {
    Plataforma p1 = new Plataforma("Playstation 5", "Sony", TipoMidia.BL);
    Plataforma p2 = new Plataforma("Playstation 4", "Sony", TipoMidia.BL);
    Plataforma p3 = new Plataforma("Switch", "Nintendo", TipoMidia.CAR);
    Plataforma p4 = new Plataforma("Xbox 360", "Microsoft", TipoMidia.DVD);
    Plataforma p5 = new Plataforma("Playstation 3", "Sony", TipoMidia.BL);
    
    Listas.getListaPlataforma().add(p1);
    Listas.getListaPlataforma().add(p2);
    Listas.getListaPlataforma().add(p3);
    Listas.getListaPlataforma().add(p4);
    Listas.getListaPlataforma().add(p5);
    
    
    Cliente c1 = new Cliente("Mario Rosa", "Visconde de Cairú, 165", "mario@gmail.com", "(48)99979-3359", "115.054.150-47");
    Cliente c2 = new Cliente("Lucas Rosa", "Vicente Nunes Barcelos, 248", "lucas@gmail.com", "(48)99669-8513", "299.481.000-00");
    Cliente c3 = new Cliente("Flávia Rosa", "Visconde de Cairú, 165", "flavia@gmail.com", "(48)99979-8427", "101.273.940-60");
    Cliente c4 = new Cliente("Geraldino Rosa", "Visconde de Cairú, 165", "dino@gmail.com", "(48)99937-9905", "642.393.060-00");
    Cliente c5 = new Cliente("Cida Rosa", "Visconde de Cairú, 165", "cida@gmail.com", "(48)98801-2818", "974.869.650-20");
    
    Listas.getListaCliente().add(c1);
    Listas.getListaCliente().add(c2);
    Listas.getListaCliente().add(c3);
    Listas.getListaCliente().add(c4);
    Listas.getListaCliente().add(c5);
    
    
    Filme f1 = new Filme("Vingadores", TipoMidia.DVD, GeneroFilmeSerie.AC, 132);
    Filme f2 = new Filme("Madrugada dos mortos", TipoMidia.DVD, GeneroFilmeSerie.TE, 115);
    Filme f3 = new Filme("Star Wars: A ameaça fantasma", TipoMidia.VHS, GeneroFilmeSerie.FC, 180);
    Filme f4 = new Filme("Se beber, não case", TipoMidia.DVD, GeneroFilmeSerie.CM, 153);
    Filme f5 = new Filme("Avatar", TipoMidia.DVD, GeneroFilmeSerie.FC, 142);
    
    Listas.getListaFilme().add(f1);
    Listas.getListaFilme().add(f2);
    Listas.getListaFilme().add(f3);
    Listas.getListaFilme().add(f4);
    Listas.getListaFilme().add(f5);
    
    
    Fornecedor fo1 = new Fornecedor("Cinevision Filmes", "Avenida Centenário, 1000", "contato@filmesx.com.br", "(48)3433-1415", "12.748.985/0001-20");
    Fornecedor fo2 = new Fornecedor("Lojão dos games", "Rua Henrique Lage, 10", "contato@ljsgames.com.br", "(48)3437-1415", "47.899.017/0001-96");
    Fornecedor fo3 = new Fornecedor("Supermercados Giassi", "Avenida Centenário, 741", "contato@giassi.com.br", "(48)3438-1415", "82.990.892/0001-80");
    
    Listas.getListaFornecedor().add(fo1);
    Listas.getListaFornecedor().add(fo2);
    Listas.getListaFornecedor().add(fo3);
    
    
    Funcionario fn1 = new Funcionario("Carlos Tomás Bento Almada", "Avenida dos Imigrantes, s/n", "carlos_almada@transmazza.com.br", "(27)99211-8909", 2500, Funcao.AT, LocalDate.of(2022, Month.MARCH, 15), "163.087.220-22");
    Funcionario fn2 = new Funcionario("Breno Joaquim Nathan Pinto", "Rua Arnaldo Andrade, 994", "carlos_almada@transmazza.com.br", "(48)99372-3427", 4000, Funcao.GE, LocalDate.of(2015, Month.APRIL, 12), "507.823.250-84");
    Funcionario fn3 = new Funcionario("Diogo César Freitas", "Rua Severina Scotti Netto, 810", "diogocesarfreitas@sectron.com.br", "(48)99565-2667", 2500, Funcao.SG, LocalDate.of(2020, Month.FEBRUARY, 01), "182.566.760-86");
    
    Listas.getListaFuncionario().add(fn1);
    Listas.getListaFuncionario().add(fn2);
    Listas.getListaFuncionario().add(fn3);
    
    
    Jogo j1 = new Jogo("God of War", TipoMidia.BL, GeneroJogo.AC, p2);
    Jogo j2 = new Jogo("God of War", TipoMidia.BL, GeneroJogo.AC, p1);
    Jogo j3 = new Jogo("Spider-Man", TipoMidia.BL, GeneroJogo.AC, p1);
    Jogo j4 = new Jogo("Super Mario Odissey", TipoMidia.CAR, GeneroJogo.AV, p3);
    Jogo j5 = new Jogo("The Elder Scrolls V: Skyrim", TipoMidia.DVD, GeneroJogo.RPG, p4);
    
    Listas.getListaJogo().add(j1);
    Listas.getListaJogo().add(j2);
    Listas.getListaJogo().add(j3);
    Listas.getListaJogo().add(j4);
    Listas.getListaJogo().add(j5);
    
    
    Produto pr1 = new Produto("Coca-cola 600ml", 6.0);
    Produto pr2 = new Produto("Trident sabor canela", 2.0);
    Produto pr3 = new Produto("Fandangos sabor queijo", 3.5);
    Produto pr4 = new Produto("Pipoca de microondas Yoki", 2.8);
    
    Listas.getListaProduto().add(pr1);
    Listas.getListaProduto().add(pr2);
    Listas.getListaProduto().add(pr3);
    Listas.getListaProduto().add(pr4);
    
    
    Serie s1 = new Serie("Game of Thrones", TipoMidia.DVD, 60, 8, GeneroFilmeSerie.FA);
    Serie s2 = new Serie("House of the Dragon",TipoMidia.DVD, 60, 1, GeneroFilmeSerie.FA);
    Serie s3 = new Serie("Supernatural",TipoMidia.DVD, 45, 15, GeneroFilmeSerie.TE);
    Serie s4 = new Serie("Shingeki no Kyojin",TipoMidia.DVD, 25, 4, GeneroFilmeSerie.AN);
    Serie s5 = new Serie("Dark", TipoMidia.DVD, 50, 3, GeneroFilmeSerie.SU);
    
    Listas.getListaSerie().add(s1);
    Listas.getListaSerie().add(s2);
    Listas.getListaSerie().add(s3);
    Listas.getListaSerie().add(s4);
    Listas.getListaSerie().add(s5);
    }
}  
