/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooexample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NarvaezSKY
 */
public class Punto5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximo;

        System.out.println("Ingresa el numero de elementos del conjunto");
        maximo = input.nextInt();
        //Aqui uso un arayList, debido a que quise implementar interaccion con el usuario, pudiendo este elegir la longitud y los elementos del array
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < maximo; i++) {
            int nValor = input.nextInt();
            lista.add(nValor);

        }

        Extract.extract(lista);

    }

    class Extract {

        static void extract(ArrayList<Integer> lista) {
            ArrayList<Integer> pares = new ArrayList<>();
            for (int num : lista) {
                if (num % 2 == 0) {
                    pares.add(num);
                }
            }
            System.out.println("Pares encontrados en el array: " + pares);
            Squared.squared(pares);

        }
    }

    class Squared {

        static void squared(ArrayList<Integer> pares) {
            ArrayList<Integer> squares = new ArrayList<>();
            for (int num : pares) {
                int square = num * num;
                squares.add(square);
            }
            
            System.out.println("Cuadrados de los pares:  " + squares);
            Sum.sum(squares);
        }
    }

    class Sum {

        static void sum(ArrayList<Integer> squares) {
            int finalSum = 0;
            for (int num : squares) {
                finalSum += num;
            }
            
            System.out.println("La suma de los cuadrados del Array es: " + finalSum);
        }
    }
}
