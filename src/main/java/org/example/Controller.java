package org.example;

import org.example.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final List<Pedido> pedidos = new ArrayList<Pedido>();


    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void exibirPedido(){

        for (Pedido pedido : pedidos){

            String mensagem = String.format(
                    "Pedido #%d%n" +
                            "Produto: %s%n" +
                            "Preço Unitário: R$ %.2f%n" +
                            "Quantidade: %d%n" +
                            "Data do Pedido: %s%n" +
                            "Total: R$ %.2f%n",
                    pedido.getId(),
                    pedido.getProduto().getNome(),
                    pedido.getProduto().getPreco(),
                    pedido.getQuantidade(),
                    pedido.getData(),
                    pedido.calcularTotal()
            );

            System.out.println(mensagem);

        }


    }

}
