
package exercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Exercicio12 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(10, 5, 20, 3));

        System.out.println("Maior: " + Collections.max(lista));
        System.out.println("Menor: " + Collections.min(lista));
    }
}
