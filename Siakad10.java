package praktikum05;
import java.util.Scanner;;

public class Siakad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas, nilaiHuruf = "", kualifikasi = "";
        // char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, uts, uas;  

        System.out.print("masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("masukkan nim : ");
        nim = sc.nextLine();
        System.out.print("masukkan kelas : ");
        // kelas = sc.nextLine().charAt(0);
        kelas = sc.nextLine();
        System.out.print("masukkan nomor absen : ");
        absen = sc.nextByte();
        System.out.print("masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukkan nilai ujian : ");
        nilaiUjian = sc.nextDouble();

        // System.out.print("masukkan nilai uts : ");
        // uts = sc.nextDouble();
        // System.out.print("masukkan nilai uas : ");
        // uas = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        // nilaiAkhir = ((nilaiKuis*0.2) + (nilaiTugas*0.15) + (uts*0.3) + (uas*0.35));

        System.out.println("mahasiswa dengan nama " + nama + " (NIM " + nim + ") Kelas " + kelas + " nomor absen " + absen );
        System.out.println("nilai akhir : " +nilaiAkhir);
        
        if(nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "gagal";            
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "kurang";
        }else if(nilaiAkhir >50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            kualifikasi = "cukup";
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            kualifikasi = "lebih dari cukup";
        }else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            kualifikasi = "baik";
        }else if(nilaiAkhir >73 && nilaiAkhir <=80){
            nilaiHuruf = "B+";
            kualifikasi = "lebih dari baik";
        }else if(nilaiAkhir > 80 && nilaiAkhir <=100){
            nilaiHuruf = "A";
            kualifikasi= "sangat baik";
        }else{
            System.out.println("nilai invalid");
        }
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " +kualifikasi);
        
    }
}
