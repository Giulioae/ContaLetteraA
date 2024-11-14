/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaletteraa;

/**
 *
 * @author Orsi Giulio
 */



import java.util.Scanner;
public class ContaLetteraA {

    // conta quante volte appare la lettera a in una parola
    public static int contaA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    // stampa la lettera A in maiuscolo quante volte è stata trovata
    public static void stampaA(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("A");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiede all'utente di inserire una parola
        System.out.print("Inserisci una parola: ");
        String input = scanner.nextLine();

        // Conta le ripetizioni di a
        int count = contaA(input);

        // Stampa la lettera A in maiuscolo quante volte è stata trovata
        System.out.println("La lettera a è stata trovata " + count + " volta");
        stampaA(count);

        scanner.close();
    }
}
