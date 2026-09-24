
package test;

import kartyacuccoop.Pakli;
import kartyacuccoop.Program;


public class Tesztek {
    
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
    

    

    

