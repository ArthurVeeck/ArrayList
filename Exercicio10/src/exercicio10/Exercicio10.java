
package exercicio10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Exercicio10 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Iterator<Integer> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
