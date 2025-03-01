import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class SwicthStatment {

    public static void main(String[] args) {
        /*
        Switch hampir sama seperti pengkondisian pada umumnya hanya saja operator yang digunakan sama dengan(==).berikut contoh penggunaan switch
         */

        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai anda : ");
        String nilai = input.next();
        /*
            switch (nilai){//disini berarti melihat hasil samadengan untuk nilai
            case "A" ://jika nilai samadengan A
                System.out.println("Anda lulus dengan nilai sempurna");
                break; //jika tidak menggunakan break maka program akan langsung dieksekusi sekaligus jadi break untuk pemisah
            case "B":
            case "C":
                System.out.println("Anda lulu dengan nilai yang baik");
                break;
            case "D":
                System.out.println("Anda harus mengulang lagi tahun depan");
                break;
            default:
                System.out.println("Maaf jawaban anda tidak dikenali");
        }
         */


        /*
        INI CONTOH SWITCH DENGAN LAMBDA
        * DENGAN MENGGUNAKAN SWITCH LAMDA KITA TIDAK PERLU MENGGUNAKAN break;

            switch (nilai){
            case "A" -> System.out.println("Anda lulu dengan nilai yang baik");
            case "B" -> System.out.println("Anda lulu dengan nilai yang baik");
            case "C" -> System.out.println("Nilai anda cukup untuk lulus");
            case "D" -> System.out.println("Anda harus mengulang lagi tahun depan");
            default -> System.out.println("Maaf jawaban tidak dikenali");
        }

         */

        /*
        INI CONTOH SWITCH DENGAN MENGGUNAKNA YIELD
        * PENGGUNAAN YIELD SAMA SEPERTI RETURN VALUE
        * SAAT MENGGUNAKAN YIEDL KITA TIDAK PERLU MEMAKAI BREAK;
         */

        String show = switch (nilai){
            case "A":
                yield "Anda lulu dengan nilai yang baik";
            case "B":
                yield "Anda lulus dengan nilai yang baik";
            case "C":
                yield "Nilai anda cukup untuk lulus";
            case "D":
                yield "Anda harus mengulang lagi tahun depan";
            default:
                yield "Maaf jawaban tidak dikenali";

        };
        System.out.println(show);





    }
}
