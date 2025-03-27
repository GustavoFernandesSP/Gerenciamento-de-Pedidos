package org.example.entity;

public class Produto {

    public Integer id;
    public String nome;
    public Double Preco;

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        Preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }

}
