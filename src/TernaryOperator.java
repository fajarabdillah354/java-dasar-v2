import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
        PROGRAM TERNERY OPERATOR SAMA DENGAN IF-ELSE HANYA SAJA DI LEBIH SINGKAT
         */

        // CONTOH JIKA MENGGUNAKAN IF-ELSE
        /*
        var nilai = 80;
        String show;
        if(nilai >= 68){
            show = "nilai anda di atas KKM"
        }
         */

        //DIBAWAH INI ADALAH CONTOH PENGGUNAAAN TERNERY OPERATOR
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai anda : ");
        int nilai = input.nextInt();
        String cek_nilai = nilai >= 70 || nilai == 68 ? "ANDA LULUS DENGAN NILAI BAIK" : "MAAF ANDA BELUM LULUS,SILAHKAN COBA LAGI ";
        System.out.println(cek_nilai);

    }

}
