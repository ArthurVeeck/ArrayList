
package exercicio08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Exercicio08 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println("Original: " + lista);

        Collections.reverse(lista);

        System.out.println("Invertida: " + lista);
    }
}
