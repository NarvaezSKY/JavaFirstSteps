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
public class Punto2 {

    static int operation(int a) {
        return (a * a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int a = input.nextInt();

        int result = operation(a);
        System.out.println("El cuadrado del numero es: " + result);
        
        input.close();

    }
}
