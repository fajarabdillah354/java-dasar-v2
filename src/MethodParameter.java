import java.util.Scanner;

public class MethodParameter {

    public static void main(String[] args) {
        /*
        pada java kita dapat membuat sebuah method dengan parameter di dalamnya sehingga ketika dipanggil harus menuliskan juga parameter yang ada didalamnya
         */
        System.out.println("------------ program menghitung umur ----------");
        countUmur(1977,2023);//saat pemanggilan parameter harus ditulis atau diberi value null

    }


    static void countUmur(int yearBorn, int yearNow){//method dengan parameter
        int umur = yearNow - yearBorn;
        System.out.println("umur anda sekarang : "+umur);
        System.out.println("*********** TERIMAKASIH ***********");
    }
}
