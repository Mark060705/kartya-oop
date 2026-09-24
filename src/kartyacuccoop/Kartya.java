
package kartyacuccoop;


public class Kartya {
    private String ertek;
    private String szin;

    public Kartya(String ertek, String szin) {
        this.ertek = ertek;
        this.szin = szin;
    }

    public String getErtek() {
        return ertek;
    }

    public String getSzin() {
        return szin;
    }
    private static String megjelnit(String ertek,String szin){
        return ertek + " " + szin;
    }

    @Override
    public String toString() {
        return "Kartya{" + "ertek=" + ertek + ", szin=" + szin + '}';
    }
    
    
}
