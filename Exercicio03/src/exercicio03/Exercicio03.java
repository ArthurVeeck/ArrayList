
package exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Exercicio03 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(r.nextInt(100) + 1);
        }

        Collections.sort(lista);
        System.out.println(lista);
    }
}
