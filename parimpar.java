<<<<<<< HEAD

=======
package excepciones_Iv2;
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de

import java.util.Scanner;

public class parimpar {
<<<<<<< HEAD
    public static void main(String[] args) {
=======
        public static void main(String[] args) {
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de
        sumaParesImpares();
    }
    
    public static void sumaParesImpares() {
        int sumaPares = 0;
        int sumaImpares = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingresa un número entero (%d de 10): ", i + 1);
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        sc.close();
<<<<<<< HEAD
        System.out.printf("El resultado: Total pares: %d; Total impares: %d", sumaPares, sumaImpares);
=======
        System.out.printf("Resultado: Total pares: %d; Total impares: %d", sumaPares, sumaImpares);
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de
    }
    
    

<<<<<<< HEAD
}
=======
}
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de
