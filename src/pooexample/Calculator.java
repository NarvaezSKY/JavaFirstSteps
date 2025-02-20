/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooexample;

import java.util.Scanner;

/**
 *
 * @author NarvaezSKY
 */
public class Calculator {

    static void operation(int OperationType, int a, int b) {

        switch (OperationType) {
            case 1:
                System.out.println("El resultado de la suma de " + a + " y " + b + " es: " + (a + b));
                break;

            case 2:
                System.out.println("El resultado de la resta de " + a + " y " + b + " es: " + (a - b));
                break;

            case 3:
                System.out.println("El resultado de la multiplicación de " + a + " y " + b + " es: " + (a * b));
                break;

            case 4:
                System.out.println("El resultado de la división de " + a + " y " + b + " es: " + (a / b));
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        String yn;
        int opType, a, b;

        do {
            System.out.println("Selecciona la operacion a ejecutar ");
            System.out.println("1. Suma 2. Resta 3. Multiplicacion 4. División ");

            opType = input.nextInt();
            System.out.println("Ingrese primer digito: ");
            a = input.nextInt();

            System.out.println("Ingrese segundo digito: ");
            b = input.nextInt();

            operation(opType, a, b);

            System.out.println("Deseas realizar otra operacion? s/n");
            input.nextLine();
            yn = input.nextLine();

            if (yn.equals("n")) {
                continuar = false;
                System.out.println("¡Nos vemos!");

            } else if (yn.equals("s")) {
                System.out.println("¡Continuemos!");
                continuar = true;
            } else {
                System.out.println("Opción inválida");
                continuar = false;
            }

        } while (continuar);

        input.close();

    }
}
