package homework;
import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        char choice;
        int number1 , number2;

        do{
            System.out.println("Enter First Number ");
            number1 = input.nextInt();
            System.out.println("Enter Second Number ");
            number2 = input.nextInt();
            int sum=number1+number2;
            System.out.println("Sum of" + number1 + " + " + number2 + " is: "+ sum);
            System.out.println("Do you want to sum 2 new numbers y/n");
            choice=input.next().charAt(0);


        }while (choice == 'y' || choice == 'Y');

    }
}