package HomeWork;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.cal();
    }

    public void cal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");
        int i = scanner.nextInt();
        if (i>0 && i<=10) {
            System.out.println("you have entered is between o and 10");
        }else if(i>10 && i<21) {
            System.out.println("the number is between 10 and 21 ");
        }else{
            System.out.println("the number you have entered is more than 20");

            }
        }
        }



