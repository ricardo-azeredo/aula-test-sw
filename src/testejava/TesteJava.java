
package testejava;

public class TesteJava {

   
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.Adiciona(new Produto("Geladeira", (double)450.0));
        carrinho.Adiciona(new Produto("Liquidificador", (double)250.00));
        carrinho.Adiciona(new Produto("Jogo de pratos", (double)70.0));
        
        
        
        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);
        
        System.out.println("O menor produto "+algoritmo.getMenor().getNome());
        System.out.println("O maior produto "+algoritmo.getMaior().getNome());
    }
    
}
