
package test;


import java.util.HashSet;
import java.util.Set;
import kartyacuccoop.Kartya;
import kartyacuccoop.Pakli;
import kartyacuccoop.Program;




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
            tesztNull();
            tesztDuplikacio();
        }
        //Márk
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
    
    //Dávid
    private static void pakliMeret(){
            System.out.println("pakli merete:");
            int vart = 22;
            Pakli pakli = new Pakli();
            int kapott = pakli.getKartyak().length;
            assert vart == kapott : "A pakli merete hibas";
            System.out.println("pakliMeret():SIKERES");
        }
    
        public static void testOszlopKeveres() {
        Pakli pakli = new Pakli();
        pakli.kever(1);
        String[] kartyakUtana = pakli.getKartyak();
        
        assert kartyakUtana.length == 22 : "keveres utan se valtozik a merete.";
        System.out.println("testOszlopKeveres() SIKERES");
    }
        
    private static void tesztNull() {
        Pakli pakli = new Pakli();
        String[] kartyak = pakli.getKartyak();
        
        for (int i = 1; i < kartyak.length; i++) {
            assert kartyak[i] != null : "Null lap található a pakliban";
        }
        System.out.println("tesztNull(): Sikeres!");
    }
    private static void tesztDuplikacio() {
        Pakli pakli = new Pakli();
        for (int kor = 1; kor <= 3; kor++) {
            pakli.kever(kor);
            String[] kartyak = pakli.getKartyak();
            Set<String> lapNevek = new HashSet<>();
            for (int i = 1; i < kartyak.length; i++) {
                assert lapNevek.add(kartyak[i]) 
                    : "Duplikált lap található a pakliban";
            }
        }
        System.out.println("tesztDuplikáció(): sikeres");
    }
    }
    

    

    

