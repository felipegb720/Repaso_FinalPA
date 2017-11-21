/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasinfinal;
import java.util.*;


/**
 *
 * @author Felipe
 */
public class CesarClass {
   //lower an upper case chars to compare strings
     String Alpha_Upper = " abcdefghijklmnñopqrstuvwxyz "; 
    
    String Alpha_Lower = " ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
    
     String CIFRASCESAR_1(String phrase, int DeltaDis){
         
        String Res = "";
        // loop so i can go throught the phrase along
        for(int i = 0;i<phrase.length();i++){ // looong
            
            if((Alpha_Lower.indexOf(phrase.charAt(i)) != -1) || (Alpha_Upper.indexOf(phrase.charAt(i)) != -1)){ 
                               if(Alpha_Lower.indexOf(phrase.charAt(i)) != -1){
                    Res+= Alpha_Lower.charAt( ( (Alpha_Lower.indexOf(phrase.charAt(i)) )+DeltaDis)%Alpha_Lower.length() );
                }
                else{
                    Res+= Alpha_Upper.charAt(( Alpha_Upper.indexOf(phrase.charAt(i)) +DeltaDis)%Alpha_Upper.length());
                }
                
            }else {
                Res += phrase.charAt(i); }
        } 
        return Res; 
    }
    
     
     
     String CIFRARCESAR_2(String Cadena, String Alphabet, int DeltaDis){
        
         String Res_txt = "";
        
        for (int k = 0;k<Cadena.length(); k++){ // loop so i can go throught the phrase along
            
            if ((Alphabet.indexOf(Cadena.charAt(k)) != -1) || (Alphabet.indexOf(Cadena.charAt(k)) != -1)){ 
                if (Alphabet.indexOf(Cadena.charAt(k)) != -1){
                    
                    Res_txt+= Alphabet.charAt( ( (Alphabet.indexOf(Cadena.charAt(k)) )+DeltaDis)%Alphabet.length() );
                }
                else{
                    
                    Res_txt+= Alphabet.charAt(( Alphabet.indexOf(Cadena.charAt(k)) +DeltaDis)%Alphabet.length());
                }
                
            }else {
                Res_txt += Cadena.charAt(k); }
        } 
        return Res_txt; 
    }
}

