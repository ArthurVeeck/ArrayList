
package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio02 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        System.out.print("Digite um nome para remover: ");
        String nome = sc.nextLine();

        if (nomes.remove(nome)) {
            System.out.println("Removido!");
        } else {
            System.out.println("Nome não encontrado.");
        }

        System.out.println(nomes);
    }
}
