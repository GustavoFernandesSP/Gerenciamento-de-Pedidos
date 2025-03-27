package org.example;


import org.example.entity.Pedido;
import org.example.Controller;
import org.example.entity.Produto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        Produto produto = new Produto(1, "Camiseta Polo", 120.0);
        Produto produto1 = new Produto(2, "Camiseta Jens", 320.0);
        Produto produto2 = new Produto(3, "Camiseta Peruana", 20.0);
        Produto produto3 = new Produto(4, "Camiseta Gola Tornado", 70.0);

        LocalDateTime dataAtual = LocalDateTime.now();

        Pedido pedidos = new Pedido(1,produto,2,dataAtual );
        Pedido pedidos2 = new Pedido(2,produto1,1,dataAtual);
        Pedido pedidos3 = new Pedido(3,produto2,10,dataAtual);
        Pedido pedidos4 = new Pedido(4,produto3,2,dataAtual );


        controller.adicionarPedido(pedidos);
        controller.adicionarPedido(pedidos2);
        controller.adicionarPedido(pedidos3);
        controller.adicionarPedido(pedidos4);

        controller.exibirPedido();




    }
}