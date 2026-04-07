
package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio01 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("Lista: " + numeros);
    }
}
