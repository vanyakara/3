/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Unit {
    public static int calculateOccuranceOfChar(String input, char character){
        int count = 0;
        for(int i=0;i<input.length();i++){
            char currentChar=input.charAt(i);
            if(Character.isLetter(currentChar)&&Character.toLowerCase(currentChar)==Character.toLowerCase(character)){
                count++;
            }
        }
        return count;
    }
}
