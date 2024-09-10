package Persewaan;
import java.util.Scanner;

public class SewaDriver {
    public static void main(String[] args) {
        String pilihan;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Menyewa CD atau DVD?");
        pilihan = s.next();
        CD CD = new CD();
        DVD DVD = new DVD();

        if(pilihan.equalsIgnoreCase("CD")) {
            CD.print();
        }else if(pilihan.equalsIgnoreCase("DVD")) {
            DVD.print();
        }
        s.close();
    }
}
