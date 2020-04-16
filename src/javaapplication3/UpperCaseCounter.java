/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Gene
 */
public class UpperCaseCounter
{
    public static void main(String[] args)
    {
        String str = "ONCE UPON a time";
        
        int numberOfUpperCaseChars=0;
        numberOfUpperCaseChars = (new UpperCaseCounter()).computeHowManyCapitalLetters(str);
        //return numberOfUpperCaseChars;
        System.out.println("No of uppercase letter : " + numberOfUpperCaseChars);
     }
    
    public int  computeHowManyCapitalLetters(String str){ 
        int numberOfUpperCaseChars=0;
        if(str ==null){
            return 0;
        }
        
        for (int i = 0; i < str.length(); i++) 
        {
            char charAt = str.charAt(i);
            int asciivalue = (int)charAt;
            if(charAt >='A' && asciivalue <= 'Z'){
                numberOfUpperCaseChars++;
            }
        }
        return numberOfUpperCaseChars;
    }
    
}