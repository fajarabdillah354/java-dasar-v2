import java.util.Scanner;


public class Pengkondisian {
    public static void main(String[] args) {
        /*
        pengkondissian if
        * if adalah suatu pengkondisian dalam java yang digunakan untuk percabangan
        * dalam percabangan kita bisa mengeksekusi suatu statment kondisinya bernilai true
         */

        Scanner input = new Scanner(System.in);//penggunaan library Scanner
        System.out.println("SILAHKAN MASUKAN NAMA ANDA : ");
        String nama = input.next();
        System.out.println("SILAHKAN MASUKAN NIM ANDA : ");
        int nim = input.nextInt();
        System.out.println("SILAHKAN MASUKAN NILAI UAS ANDA : ");
        int nilaiUas = input.nextInt();
        if(nama.equals("fajar") && nim == 2103015111 && nilaiUas >=68 ){
            System.out.println("Selamat "+ nama +" anda adalah mahasiswa uhamka. dan anda lulus ujian akhir semester");
        } else if (nama.equals("ujeh") && nim == 2103015047 && nilaiUas >= 68) {
            /*
            pengkondisian dengan else-if()
            * digunakan jika kita ingin membuat beberapa pengkondisian sekaligus
             */
            System.out.println("Selamat "+ nama + " anda adalah mahasiswa uhamka dan anda lulu ujian akhir semester");
        } else {
             /*
            pengkondisian dengan else
            * penggunaan else hanya dieksekusi jika program tidak terpenuhi
            */
            System.out.println("anda bukan mahasiswa uhamka dan anda tidak lulus ujian");
        }






    }

}
