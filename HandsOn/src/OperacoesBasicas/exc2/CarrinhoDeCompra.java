package OperacoesBasicas.exc2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    //atributo
    private List<Item> compraCarrinho;

    public CarrinhoDeCompra(List<Item> compraCarrinho) {
        this.compraCarrinho = compraCarrinho;
    }

    //construtor
    public CarrinhoDeCompra() {
        this.compraCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.compraCarrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> remocaoItems = new ArrayList<>();
        if (!compraCarrinho.isEmpty()) {
            for (Item item : compraCarrinho) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    remocaoItems.add(item);
                }
            }
            compraCarrinho.removeAll(remocaoItems);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!compraCarrinho.isEmpty()) {
          for (Item item : compraCarrinho) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if(!compraCarrinho.isEmpty()) {
            System.out.println(this.compraCarrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + compraCarrinho +
          '}';
    }
}
