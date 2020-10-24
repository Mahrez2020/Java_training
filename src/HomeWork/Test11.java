package HomeWork;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //  Test11 test11 =new Test11();
        // test11.cal();
        //  test11.cal();
        cal();
    }

    public static void cal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number please?");
        int i = scanner.nextInt();
        // for(int j=1;j<=5)
        if (i >= 0 && i < 40) {

            System.out.println("you are in austin tx");
        } else if (i >= 40 && i < 80) {
            System.out.println("you are in round rock tx");
        } else if (i >= 80 && i < 120) {
            System.out.println("you are in ceder park tx");

        } else {
            System.out.println("you are outside of austin city");

        }
    }

}




