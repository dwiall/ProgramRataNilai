package si_regpagi_22166030_latihan21_programratanilai;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program rata-rata nilai yang inputannya berasal dari user
 */
public class SI_RegPagi_22166030_Latihan21_ProgramRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Masukkan banyaknya mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        
        //Variabel
        int JmlMahasiswa = input.nextInt();
        double TotalNilai = 0;
        
        //Kondisi perulangan menggunakan for, di mana i digunakan untuk menghitung iterasi dalam perulangan
        for (int i = 1; i <= JmlMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            double nilai = input.nextDouble();
            TotalNilai += nilai;
        }
        
        //Menghitung nilai rata-rata mahasiswa
        double rataRata = TotalNilai / JmlMahasiswa;
        
        //Mencetak hasil rata-rata nilai mahasiswa
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by: Dwi Ayu Lestari");
    }
    
}
