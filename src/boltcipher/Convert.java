/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boltcipher;

/**
 * This interface stores the methods required to 
 * convert from plaintext to ciphertext and vice versa.
 * 
 * @author Andrew
 */
public interface Convert {
    public char character(char c);
    public String word(String word);
    
}
