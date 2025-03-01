public class TipedataArray {

    /**
     * array adalah kumpulan data yang bertipe data sama
     * jumlah data di array tiaak bisa berubah setelah pertama kali dibuat
     */

    public static void main(String[] args) {
        /*
        CONTOH ARRAY YANG DIBUAT DENGAN MANUAL
         */
        String[] listBelanja ;
        listBelanja = new String[3]; // disini menggunakan object dari String lalu diberi nilai untuk jumlah indexnya
        listBelanja[0] = "nabati : 2000";
        listBelanja[1] = "better : 1500";
        listBelanja[2] = "arinda : 500";
        System.out.println(listBelanja[0]);
        System.out.println(listBelanja[1]);
        System.out.println(listBelanja[2]);

//        contoh untuk mengganti value pada index kita dapat langsung ke arah index yang ingin diganti
        System.out.println("ini adalah value untuk index ke 0 : "+listBelanja[0]);
        listBelanja[0] = "gula : 8000";
        System.out.println("sekarang telah terjadi perubahan pada index ke 0 menjadi : "+listBelanja[0]);
//        contoh untuk mengambil panjang data array  dengan function length()
        System.out.println(listBelanja[0].length());

        /*
        DENGAN INISIALISASI ARRAY
         */
//        contoh pertama
        int[] antrianMakan = new int[]{
          2,3,6,8,12,17
        };

//        contoh kedua
        String[] iniInitial = {

        };

//        contoh ketiga
        long[] arrayLong = {

        };


    }

}
