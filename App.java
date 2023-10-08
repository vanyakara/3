/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Vuvedete tekst: ");
        String input=scanner.nextLine();
        System.out.print("Vuvedete simvol, koito iskate da tursete: ");
        char character=scanner.next().charAt(0);
        int count=Unit.calculateOccuranceOfChar(input, character);
        System.out.println("Turseniqt simvol e: "+character);
        System.out.println("Sreshta se "+count+" putq v teksta.");
    }
}
