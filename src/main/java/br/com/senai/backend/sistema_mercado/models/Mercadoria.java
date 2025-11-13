package br.com.senai.backend.sistema_mercado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mercadoria")
public class Mercadoria {
    @Id //serial key
    @GeneratedValue(strategy=GenerationType.IDENTITY)//serial key
    @Column(name="id")
    private Integer id;
    
    @Column(name="preco")
    private double preco;

    @Column(name="quantidade")
    private int quantidade;

    @Column(name="nome")
    private String nome;

    @Column(name="categoria")
    private String categoria;

    public Mercadoria() {
    }

    public Mercadoria(Integer id, double preco, int quantidade, String nome, String categoria) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
    
    
}
