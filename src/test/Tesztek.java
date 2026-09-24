/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import kartyacuccoop.Kartya;
import kartyacuccoop.Pakli;

/**
 *
 * @author ammer.mark
 */
public class Tesztek {
        public static void main(String[] args) {
            megjelenitTest();
            pakliFeltolt();
        }
        
        static void megjelenitTest(){
            Kartya kartya = new Kartya("Ász", "P"); assert kartya.getErtek().equals("Ász");
            assert kartya.getSzin().equals("P");
            assert kartya.megjelnit().equals("Ász_P"); 
            System.out.println("A megjelenit() teszt sikeres!");
        }
        
        static void pakliFeltolt(){            
            Pakli pakli = new Pakli();
            String[] kartyak = pakli.getKartyak();
            assert kartyak[0] == null;
            for (int i = 1; i < kartyak.length; i++) {
                assert kartyak[i] != null;
            }
            System.out.println("A feltolt() teszt sikeres!");            
        }
    
    
}
