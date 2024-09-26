package praktikum05;
import java.util.Scanner;
public class PemilihanHariDenganIf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka antara (1-7): ");
        int input = sc.nextInt();
        if(input >= 1 && input <= 5){
            System.out.println("Weekday");
        }else if(input == 6 || input == 7){
            System.out.println("Weekend");
        }else{
            System.out.println("invalid number");
        }
    }
}
