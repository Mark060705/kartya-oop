
package kartyacuccoop;

    import java.util.Arrays;
    import java.util.Scanner;
public class Program {
    
    static Pakli pakli = new Pakli();
    static Scanner scanner = new Scanner(System.in);
    
    private static void kirak() {
        String szoveg = "";

        for (int i = 1; i < 22; ++i) {
            szoveg += String.format("%-8s", pakli.getKartyak()[i]);

            if (i % 3 == 0) {
                szoveg += "\n";
            }
        }

        System.out.println(szoveg);
    }
    private static int melyik() {
        System.out.println("melyik oszlop? (1-3)");
        
        int number;
        number = scanner.nextInt();
        
        if(number < 1 || number > 3){
        
            while(number < 1 || number > 3) {
                System.out.print("1-től  3-ig: ");
                number = scanner.nextInt();
            }
        }
        return number;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            kirak();
            pakli.kever(melyik());
        }
        kirak();
        System.out.println(pakli.ezVolt());
    }
}
