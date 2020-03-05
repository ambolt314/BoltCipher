/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boltcipher;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Andrew
 */
public class BoltCipher {

    /**
     * This stores each available character with its associated index.
     */
    public static String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!.?#,;:\\w\\n\\r\\t";
    public static ArrayList<Character> dictionary = new ArrayList<>();

    public static void main(String[] args) {

        for (char c : characters.toCharArray()) {
            dictionary.add(c);
        }

        System.out.println("Please enter a word: ");
        String input = new Scanner(System.in).nextLine();

        System.out.println("You entered: " + input);

        Encrypt e = new Encrypt();
        input = e.word(input);

        System.out.println("The ciphertext is: " + input);
    }

    public static ArrayList<Integer> splitNumber(Integer input) {
        ArrayList<Integer> output = new ArrayList<>();
        
        Stack<Integer> s = new Stack();
        
        while(input > 0) {
            s.push(input % 10);
            input /= 10;
        }
        
        while(!s.isEmpty()) {
            output.add(s.pop());
        }
        
        

        return output;

    }

}
