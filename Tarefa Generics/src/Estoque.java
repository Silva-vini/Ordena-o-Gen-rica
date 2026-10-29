import java.util.ArrayList;
import java.util.List;

public class Estoque {

    public static void main(String[] args){

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        produto1.setNome("Iphone 13");
        produto1.setPreco(2599.99);

        produto2.setNome("Geladeira");
        produto2.setPreco(3826.41);

        produto3.setNome("Notebook");
        produto3.setPreco(5290.00);

        produto4.setNome("Sofa");
        produto4.setPreco(780.30);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        ListaUtil.ordenarExibir(produtos);
    }
}
