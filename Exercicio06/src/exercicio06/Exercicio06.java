
package exercicio06;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio06 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            palavras.add(sc.nextLine());
        }

        System.out.print("Palavra para contar: ");
        String busca = sc.nextLine();

        int count = 0;
        for (String p : palavras) {
            if (p.equals(busca)) count++;
        }

        System.out.println("Aparece " + count + " vezes.");
    }
}
