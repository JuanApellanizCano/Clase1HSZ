package excepciones_Iv2;

import java.util.Scanner;

public class serie {
   
    public static void main(String[] args) {
        serieSuma();
    }
    public static void serieSuma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int numero = sc.nextInt();
        sc.close();
        int suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma += i;
        }
        System.out.printf("Suma de los %d primeros números = %d", numero, suma);
    }
}