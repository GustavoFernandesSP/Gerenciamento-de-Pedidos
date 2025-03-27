package org.example.entity;

import java.time.LocalDateTime;

public class Pedido {

    public Integer id;
    public Produto produto;
    public Integer quantidade;
    public LocalDateTime data;

    public Pedido(Integer id, Produto produto, Integer quantidade, LocalDateTime data) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
    }


    public Double calcularTotal(){return produto.getPreco() * quantidade;}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
