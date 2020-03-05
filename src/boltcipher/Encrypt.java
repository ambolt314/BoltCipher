/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boltcipher;

import static boltcipher.BoltCipher.dictionary;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The encryption algorithm of the Bolt Cipher is detailed below:
 * 
 * take the index of the character from 0
 * split this number by digit
 * take each digit and calculate 2^digit
 * take the sum for all digits
 * the output is the index of the ciphertext character
 * look this up in the dictionary
 * retrieve that character and print
 * 
 * @author Andrew
 */
public class Encrypt {

    public char character(char c) {

        int plainValue = 0;
        int cipherValue = 0;

        plainValue = dictionary.indexOf(c);
        // Encyphering of the character
        ArrayList<Integer> split = BoltCipher.splitNumber(plainValue);
        
        for (int i = 0; i < split.size(); i++) {
            cipherValue += Math.pow(2, split.get(i));
        }

        return dictionary.get(cipherValue % dictionary.size());

    }

    public String word(String word) {
        char[] plainValue = word.toCharArray();

        StringBuilder cipherValue = new StringBuilder();

        for (int i = 0; i < plainValue.length; i++) {
            cipherValue.append(character(plainValue[i]));
        }

        return cipherValue.toString();
    }

}
