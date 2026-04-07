
package exercicio04;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio04 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");

        System.out.print("Digite o produto: ");
        String p = sc.nextLine();

        if (produtos.contains(p)) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Não encontrado.");
        }
    }
}
