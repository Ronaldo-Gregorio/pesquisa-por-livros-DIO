package com.br.livrariaDIO;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int setAnoPublicacao){
        livroList.add(new Livro(titulo, autor, setAnoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros cl = new CatalagoLivros();

        cl.adicionarLivro("Livro 1", "Autor 1", 2020);
        cl.adicionarLivro("Livro 1", "Autor 2", 2021);
        cl.adicionarLivro("Livro 2", "Autor 2", 2022);
        cl.adicionarLivro("Livro 3", "Autor 3", 2023);
        cl.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(cl.pesquisarPorAutor("Autor 2"));

        System.out.println(cl.pesquisarPorIntervaloAnos(2020, 2022));
    }
}
