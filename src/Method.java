import java.sql.SQLOutput;
import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        /*
        pada java kita bisa membuat method-method yand dapat kita gunakan berkali-kali.Kata kunci untuk membuat method adalah STATIC <tipeDatanya> <namaMethodnya> (){
        }

        ex -> void countAge(){

        }

         */


        System.out.println("============ Menghitung umur seseorang ===========");
        countAge();//pemanggilan method yang ada dibawah
        System.out.println("******************* TERIMAKASIH ******************");



    }


    public static int countAge(){//penggunaan public merupakan akses identifier
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tahun kelahiran anda : ");
        int tahun = input.nextInt();
        System.out.print("Masukan tahun sekarang : ");
        int tahunNow = input.nextInt();
        int count = tahunNow - tahun;
        System.out.println("umur anda sekarang adalah : "+count);
        return count;
    }


}
