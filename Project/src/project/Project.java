package project;

import java.util.Arrays;

/**
 *
 * @author nemanja
 */
public class Project {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 7, 8};
        int array3[] = new int[array.length + array2.length];
        /*Metoda arraycopy kopira jedan niz u drugi pocevsi od date pozicije i date duzine */

//        Kopiranje prvog niza u treci niz
        System.arraycopy(array, 0, array3, 0, array.length);
//        Kopiranje drugog u treci niz
        System.arraycopy(array2, 0, array3, array.length, array2.length);

        System.out.println("Length: " + array3.length);
        System.out.println(Arrays.toString(array3));
        
        
    }

}
