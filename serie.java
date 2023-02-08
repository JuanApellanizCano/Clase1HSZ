<<<<<<< HEAD

=======
package excepciones_Iv2;
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de

import java.util.Scanner;

public class serie {
<<<<<<< HEAD

=======
   
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de
    public static void main(String[] args) {
        serieSuma();
    }
    public static void serieSuma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int numero = sc.nextInt();
        sc.close();
        int suma = 0;
<<<<<<< HEAD
        for (int i = 1; i <= numero; i++) {
=======
        for (int i = 0; i <= numero; i++) {
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de
            suma += i;
        }
        System.out.printf("Suma de los %d primeros números = %d", numero, suma);
    }
}