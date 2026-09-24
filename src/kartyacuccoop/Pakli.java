
package kartyacuccoop;



import java.util.Arrays;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */


public class Pakli {
    private Kartya[] kartyak = new Kartya[22];

    public Pakli() {
        feltolt();
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                Kartya k = new Kartya(szin, ertek);
                if(db < 21){
                    kartyak[++db] = k;
                }
            }
        }
    }
    
    public void kever(int oszlop) {
            Kartya[] uj = new Kartya[22];

            switch (oszlop) {
            case 2:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = kartyak[19 - (sor - 1) * 3];
                    uj[sor+7] = kartyak[20 - (sor - 1) * 3];
                    uj[sor+14] = kartyak[21 - (sor - 1) * 3];
                }
                break;
                
            case 1:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = kartyak[20 - (sor - 1) * 3];
                    uj[sor+7] = kartyak[19 - (sor - 1) * 3];
                    uj[sor+14] = kartyak[21 - (sor - 1) * 3];
                }
                break;
            case 3:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = kartyak[20 - (sor - 1) * 3];
                    uj[sor+7] = kartyak[21 - (sor - 1) * 3];
                    uj[sor+14] = kartyak[19 - (sor - 1) * 3];
                }
                break;
            default:
                throw new AssertionError();
            }
            

            kartyak = uj;
    }
    
    private Kartya ezVolt() {
        Kartya[] kartyakCopy = Arrays.copyOf(kartyak, kartyak.length);
        
        return kartyakCopy[11];
    }

    public Kartya[] getKartyak() {
        
        Kartya[] kartyakCopy = Arrays.copyOf(kartyak, kartyak.length);
        
        return kartyakCopy;
    }
    
    
}
