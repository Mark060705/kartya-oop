
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
            pakliMeret();
            testOszlopKeveres();
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
    
    
    private static void pakliMeret(){
        Pakli pakli = new Pakli();
        String[] kartyak = pakli.getKartyak();
        
        if (kartyak != null && kartyak.length == 22) {
            System.out.println("pakliMeret: SIKERES");
        } else {
            System.out.println("pakliMeret: HIBA! A tömb nem 22 elemű vagy null.");
        }
    }
        public static void testOszlopKeveres() {
        Pakli pakli = new Pakli();
        pakli.kever(1);
        String[] kartyakUtana = pakli.getKartyak();
        
        assert kartyakUtana.length == 22 : "keveres utan se valtozik a merete.";
        System.out.println("testOszlopKeveres: SIKERES");
    }
    }
    

    

    

