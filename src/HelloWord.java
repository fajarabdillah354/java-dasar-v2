
//Define a class named HelloWord
public class HelloWord {
    //Main method for running program
    public static void main(String[] args) {
        //print helloword
        System.out.println("testing helloword");


        double salary = 10000000;
        char grade = 'A';
        boolean isPassed = true;



        int x = 10, y = 5;
        System.out.println(x + y); // Output: 15
        System.out.println(x > y); // Output: true


        int age = 18;
        if (age >= 17) { //true conditions
            System.out.println("You are eligible to vote.");
        }


        int number = -5;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }


        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: //this section will be print
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }


        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }


//        int i = 1;
//        while (i <= 5) {
//            System.out.println("Iteration: " + i);
//            i++;
//        }



        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);


    }
}
