import java.util.Scanner;

public class BreakandcContinue {

    public static void main(String[] args) {

        /*
        SAAT MELAKUKAN PERULANGAN KITA DAPAT MEMBUAT PROGRAM BERHENTI DENGAN 2 FUNCTION YAITU BREAK DAN CONTINUE
        * JIKA MENGGUNAKAN BREAK MAKA KESELURUHAN PERULANGAN AKAN DI BERHENTIKAN
        * TAPI JIKA MENGGUNAKAN CONTINUE MAKA PERULANGAN SAAT ITU JUGA YANG DIBERHENTIKAN LALU LANJUT PROGRAM SETELAHNYA
         */
     var hitung = 1;
     while (true){
         System.out.println("perulangan ke - "+hitung);
         hitung ++;
         if (hitung > 10){
             break;// CONTOH JIKA MENGGUNAKAN BREAK
         }
     }

     Scanner input = new Scanner(System.in);
        System.out.print("masukan angka pilihan anda : ");
        int angka = input.nextInt();
        for (int count = 0 ; count <= angka; count++){
            if (count % 2 == 0 ){
//                System.out.println("ini adalah angka genap");
//                System.out.println(count);
                continue;
            }
            System.out.println("perulangan ganjil ke - "+ count);
        }



    }


}
