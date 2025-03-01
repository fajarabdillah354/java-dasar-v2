public class MethodReturnValue {

    public static void main(String[] args) {
        /*
        pada java kita dapat membuat method yang mempunyai nilai return value, caranya saat membuat method kita harus menuliskan tipe data yang memiliki nilai return
         */


        var a = 3249;
        var b = 1895;
        var tambah = sum(a,b);
        var kali = multiple(a,b);
        System.out.println("hasil operasi penjumlahan : "+tambah);
        System.out.println("hasil operasi perkalian : "+kali);
        var bagi = hitung(a,"/", b);
        System.out.println("hasil operasi pembagian : "+bagi);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int multiple(int a, int b){
        return a*b;
    }

    /*
    Dibawah ini contoh jika menggunakan pengkondisian
     */

    static float hitung(int a, String operasi, int b){
        switch (operasi){
            case "+":
                return a+b;
            case "/":
                return a%b;
            case "*":
                return a*b;
            case "-":
                return a-b;
            default:
                return 0;
        }
    }



}
