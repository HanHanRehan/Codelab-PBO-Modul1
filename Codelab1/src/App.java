import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main (String[] args) { 
       
            //kumpulan para variable
        String nama;
        String kelamin;
        Scanner input = new Scanner(System.in);

            //Input Nama
        System.out.print("Nama : ");
        nama = input.nextLine();

            //Input Kelamin
        System.out.print("Kelamin (L/P) : ");
        kelamin = input.nextLine();
            
            if (kelamin.equals ("L") ) {
                kelamin = "Laki-Laki";
            }
            else if (kelamin.equals ("P") ) {
                kelamin = "Perempuan";
                
            }
            else{
                kelamin = "Kelamin Tidak terdeteksi";
            }
            
            //input tanggal
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = input.nextLine();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);
        
        LocalDate tanggalSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggalSekarang);

        int tahunLahir = periode.getYears();
        int bulanLahir = periode.getMonths();
        
        System.out.println("");

                //Hasil Output
            System.out.println("Nama : " + nama);
            System.out.println("Kelamin : " + kelamin);
            System.out.println("Umur: " + tahunLahir + " tahun " + bulanLahir + " bulan ");
    }
}
