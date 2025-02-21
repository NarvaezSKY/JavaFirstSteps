/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooexample;

/**
 *
 * @author NarvaezSKY
 */
import java.util.Scanner;
public class Punto1 {
    
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int a, b, r;
    

    System.out.println("Ingrese la base");
    a=input.nextInt();
    
    System.out.println("Ingrese la altura");
    b=input.nextInt();
    
    r=(a*b);
    
    System.out.println("Area: " + r);
    
    }
}
