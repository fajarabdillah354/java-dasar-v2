package StudiKasus;

import java.util.Scanner;

public class ApkPembelianPaket {
    public static String[] list = new String[10];

    public static void main(String[] args) {
        testShowMenu();
    }

    public static void showMenu(){
        System.out.println("********* Selamat Datang Di Ujeh Cell *********");

        for (var a = 0;a< list.length;a++){
            String todo = list[a];
            var nomor = a+1;

            if (todo != null){
                System.out.println(nomor+". "+todo);
            }
        }

    }


    public static void testShowMenu(){
        list[0] = "Paket internet NGEBUT";
        list[1] = "Paket ComboYoutube";
        list[2] = "Paket Nelfon allOperator";
        list[3] = "Paket internet harian";
        showMenu();
        pilihPaket();


    }

    public static void pilihPaket(){
        int pilih;
        Scanner input = new Scanner(System.in);
        System.out.print("Silahkan pilih paket yang ingin anda beli : ");
        pilih = input.nextInt();
        if (pilih == 1){
            Scanner input1 = new Scanner(System.in);
            String ucapan = list[0];
            System.out.print("apakah anda yakin membeli "+ucapan+" untuk 30 hari dengan harga 50.000, ketik y/n(n untuk kembali kehalaman awal) : ");
            String ketik = input1.nextLine();
            if (ketik.equals("y")){
                System.out.println("Temarikasih anda baru saja membeli paket internet NGEBUT");
            }else {
                testShowMenu();
            }

        } else if (pilih == 2) {
            Scanner input1 = new Scanner(System.in);
            String ucapan = list[1];
            System.out.print("apakah anda yakin membeli" +ucapan+" untuk 30 hari dengan harga 40.000, ketik y/n (n untuk kembali ke menu awal) : ");
            String ketik = input1.nextLine();
            if (ketik.equals("y")){
                System.out.println("Terimakasih anda baru saja membeli paket internet Combo Youtube");
            }else {
                testShowMenu();
            }
        } else if (pilih == 3) {
            Scanner input1 = new Scanner(System.in);
            String ucapan = list[2];
            System.out.print("apakah anda yakin membeli" + ucapan + " untuk 30 hari dengan harga 40.000, ketik y/n (n untuk kembali ke menu awal) : ");
            String ketik = input1.nextLine();
            if (ketik.equals("y")) {
                System.out.println("Terimakasih anda baru saja membeli paket internet Nelfon Allop");
            } else {
                testShowMenu();
            }
        }else if (pilih == 4) {
            Scanner input1 = new Scanner(System.in);
            String ucapan = list[3];
            System.out.print("apakah anda yakin membeli" + ucapan + " untuk 30 hari dengan harga 20.000, ketik y/n (n untuk kembali ke menu awal) : ");
            String ketik = input1.nextLine();
            if (ketik.equals("y")) {
                System.out.println("Terimakasih anda baru saja membeli paket internet internet Harian");
            } else {
                testShowMenu();
            }
        }
    }




}
