import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista_Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaCompras = new ArrayList<>();

        System.out.println("Digite a quantidade de produtos a serem armazenados na lista: ");
        Integer numeroProdutos = sc.nextInt();

        String produto;
        Integer qtd;
        Double preco;
        Double valorTotal = 0d;

        for (int i = 0; i < numeroProdutos; i++) {
            System.out.println("Digite o nome do produto " + (i+1) + " : ");
            produto = sc.next(); //

            System.out.println("Digite a quantidade de produtos " + (i+1) + " : ");
            qtd = sc.nextInt();

            System.out.println("Digite o preço do produto " + (i+1) + " : ");
            preco = sc.nextDouble();


            listaCompras.add(produto);
            listaCompras.add(String.valueOf(qtd));
            listaCompras.add((String.valueOf(preco)));

        }


        for (int i = 2; i < listaCompras.size(); i+=3) {
            Double valor = Double.parseDouble(listaCompras.get(i));
            Integer numeroCompra = Integer.parseInt((listaCompras.get(i-1)));
            Double precoTotal = valor * numeroCompra;
            valorTotal += precoTotal;

        }
        System.out.println();
        int cont = 0;
        for (int i = 0; i < numeroProdutos; i++) {
            System.out.println("Nome: " + listaCompras.get(i + cont + cont) + " Quantidade: " + listaCompras.get(i+cont + 1+ cont) + " Preço: " + listaCompras.get(i+cont+2 + cont));
            cont++;
        }
        System.out.println("O preço total dos produtos: R$" + valorTotal);
    }
}
