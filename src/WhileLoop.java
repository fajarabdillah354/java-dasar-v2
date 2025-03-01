import java.util.Scanner;

public class WhileLoop {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("umur : ");
        int getName = input.nextInt();
        while(getName <5){
            System.out.println("data sudah benar dan sesuai");
            getName ++;
        }


        /*
        DO WHILE LOOP ADALAH PERULANGAN YANG MIRIP DENGAN WHILE HANYA SAJA DO WHILE DILAKUKAN SETELAH PERULANGAN DILAKUKAN (LOOP DI AWAL DAN DO WHILE LOOP DI AKHIR)
        * PERULANGAN DO WHILE LOOP HANYA DIJALANKAN SEKALI

        do{

        }while(){

        }

         */
    }
}
