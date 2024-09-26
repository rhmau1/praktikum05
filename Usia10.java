package praktikum05;
import java.util.Scanner;
public class Usia10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan usia (dalam angka): ");
        int usia = sc.nextInt();

        String kategoriUsia = "";
        if (usia < 0) {
            System.out.println("input tidak valid");
        }else if(usia >= 0 && usia <= 12) {
            kategoriUsia = "anak";
        }else if(usia >= 13 && usia <= 19){
            kategoriUsia = "remaja";
        }else if(usia >= 20 && usia <= 64){
            kategoriUsia = "dewasa";
        }else{
            kategoriUsia = "lansia";
        }
        System.out.println("Usia " + usia + " termasuk kedalam kategori usia " + kategoriUsia);
    }
}
