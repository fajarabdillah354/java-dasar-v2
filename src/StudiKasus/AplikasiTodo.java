package StudiKasus;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AplikasiTodo {

    public static String[] listTodo = new String[10];

    public static void main(String[] args) {
       viewShowTodo();
    }

    /**
     * showing todoList
     */
    public static void showTodo(){
        System.out.println("******** MY TODOLIST *******");
        for (var i = 0; i< listTodo.length; i++){
            String todo = listTodo[i];
            var nomor = i+1;

            if (todo != null){
                System.out.println(nomor+ ". "+todo);
            }
        }
    }

    /*
    public static void testShowTodo(){
        listTodo[0] = "bangun tidur";
        listTodo[1] = "mandi";
        listTodo[2] = "sarapan";
        showTodo();
    }

     */

    public static void addTodo(String todo){
        //mengecek apakah list penuh
        var isfull = true;
        for (int i = 0;i< listTodo.length;i++){
            if(listTodo[i] == null){
                // list masih kosong
                isfull = false;
                break;
            }
        }

        // jika penuh diresize arraynya menjadi 2kali penuh
        if (isfull){
            var temp = listTodo;
            listTodo = new String[listTodo.length *2 ];

            for (int i = 0; i< temp.length;i++){
                listTodo[i] = temp[i];
            }

        }


        //tambahkan ke posisi yang data arraynya null
        for (var i = 0; i< listTodo.length;i++){
            if (listTodo[i] == null){
                listTodo[i] = todo;
                break;
            }
        }

    }

    /*

    public static void testAddTodo(){
        for (var i=0;i<25;i++){
            System.out.println("todo ke - "+ i);
        }
    }

     */

    public static boolean removeTodo(Integer num) {
        if (num - 1 >= listTodo.length) {
            return false;
        } else if (listTodo[num - 1] == null) {
            return false;
        } else {
            for (int i=(num-1); i<listTodo.length;i++ ){
                if(i == listTodo.length-1){
                    listTodo[i] = null;
                }else{
                    listTodo[i] = listTodo[i+1];
                }
            }
            return true;
        }

    }

    /*


    public static void testRemoveTodo(){
        addTodo("penggaris");
        addTodo("pulpen");
        addTodo("buku");

        var result = removeTodo(2);
        System.out.println(result);
        showTodo();

    }

     */

    public static String input(String choice){
        Scanner scanner = new Scanner(System.in);
        System.out.print(choice+ ": ");
        String data = scanner.nextLine();
        return data;
    }

    /*


    public static void testInput(){
        var name = input("nama");
        System.out.println("Hi "+name);
    }

     */


    public static void viewShowTodo(){
        while(true){
            showTodo();

            System.out.println(" MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodo();
            } else if (input.equals("2")) {
                viewRemoveTodo();
            } else if (input.equals("3")) {
                break;
            } else{
                System.out.println("Pilihan tidak di mengerti");
            }
        }

    }

    /*


    public static void testViewShowTodo(){
        addTodo("satu");
        addTodo("dua");
        addTodo("tiga");
        addTodo("empat");
        addTodo("lima");
        viewShowTodo();
    }

     */

    public static void viewAddTodo(){
        System.out.println("========= MENAMBAH TODO ========= ");
        var todo = input("enter your todo(x jika batal) ");
        if (todo.equals("x")){
            //batal
        }else{
            addTodo(todo);
        }
    }

    /*


    public static void testViewAddTodo(){
        addTodo("fajar");
        addTodo("sandi");
        addTodo("ryan");
        viewAddTodo();
        showTodo();
    }

     */

    public static void viewRemoveTodo(){
        System.out.println("========== MENGHAPUS TODO ========== ");
        var number = input("pilih list yang dihapus ");
        if(number.equals("x")){
            //batal
        }else{
            boolean succes = removeTodo(Integer.valueOf(number));
            if(! succes){
                System.out.println("GAGAL MENGHAPUS LIST : "+ number);

            }
        }

    }

    /*


    public static void testViewRemoveTodo(){
        addTodo("fajar");
        addTodo("sandi");
        addTodo("ryan");
        addTodo("hasan");
        showTodo();

        viewRemoveTodo();
        showTodo();
    }

     */

}
