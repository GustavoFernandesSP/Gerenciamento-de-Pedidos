package org.example;

import org.example.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<Pedido> pedidos = new ArrayList<Pedido>();


    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void exibirPedido(){

        for (Pedido pedido : pedidos){

            System.out.println("Pedido " + "#" + pedido.getId());
            System.out.println("Produto " + "#" + pedido.getProduto().getNome());
            System.out.println("Preço unitário : R$ " + pedido.getProduto().getPreco());
            System.out.println("Quantidade: " + pedido.getQuantidade());
            System.out.println("Data do Pedido: " + pedido.getData());
            System.out.println("Total: R$: " + pedido.calcularTotal());
            System.out.println("-------------------------------------------------------------");
        }


    }

}
