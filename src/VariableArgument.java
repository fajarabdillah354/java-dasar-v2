public class VariableArgument {

    public static void main(String[] args) {
        /*
        saat menggunakan variabel argument kita dapat langsung mengakses array yang ada tanpa menulisnya lagi dalam parameter dan tidak perlu membuat array yang menampung list-list
         */

        // CONTOH

        sayContrac("fajar", 85,85,94,68);
        sayContrac("fadil", 68,84,60,90);
    }


    static void sayContrac(String name , int... nilaiUjian){//ini adalah contoh dari variabel argument
        var total = 0;
        for(var value : nilaiUjian){
            total += value;
        }
        var grade = total/nilaiUjian.length;
        if (grade >= 80){
            System.out.println("anda lulus dengan nilai A");
        } else if (grade >= 68) {
            System.out.println("anda lulus dengan nilai b");
        } else if (grade >= 50) {
            System.out.println("anda lulus dengan nilai c");
        }else {
            System.out.println("anda tidak lulus");
        }

    }

}
