package java101;
import java.util.Scanner;
public class MetodAsalBulma {

    public static boolean AsalMi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int sayi= inp.nextInt();
        if (sayi <= 1) {
            return false;
        }
        if (sayi <= 3) {
            return true;
        }
        if (sayi % 2 == 0 || sayi % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= sayi; i += 6) {
            if (sayi % i == 0 || sayi % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }




    public static void main(String[] args) {
        System.out.println(AsalMi());
    }
}
