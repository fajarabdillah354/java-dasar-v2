public class RecursiveMethod {

    /*
    adalah suatu aktifitas pemanggilan method itu sendiri, ini mempunyai kekurangan yaitu jika pemanggilannya terlalu dalam akan stack overflow
     */


    public static void main(String[] args) {
        System.out.println(recursiveMethod(6));//jika memakai recursive method
        System.out.println(noRecursiveMethod(5));
    }

    //CONTOH PENGGUNAAN RECURSIVE METHOD PADA FAKTORIAL
    static int recursiveMethod(int angka){
        if (angka == 1){
            return 1;
        }else {
            return angka * recursiveMethod(angka-1);
        }

    }

    //CONTOH TIDAK MEMAKAI RECURSIVE METHOD, HARUS MENGGUNAKAN PERULANGAN FOR
    static int noRecursiveMethod(int angka){
        int result = 1;
        for (int hitung = 1; hitung <= angka; hitung++){
            result *= hitung;

        }
        return result;
    }






}
