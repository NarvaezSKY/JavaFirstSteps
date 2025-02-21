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
public class Punto3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el numero");
        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println(i);
            if (i==5){
                System.out.println("flipas chaval");
            }
        }
        input.close();

    }
}
