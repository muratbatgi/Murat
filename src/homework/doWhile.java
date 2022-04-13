package homework;

import java.sql.SQLOutput;

public class doWhile {


        public static void main(String[] args) {

            int number = 3;

            do {

                System.out.println("number =" + number);

                number++;

            } while (number < 10);

            System.out.println("*******");

            int number3 = 5;
            do {
                System.out.println(number3);
            } while (number3 < 5);// doesnt work because it is not match. out of loop.

            System.out.println("******");

            int sum=0;
            int number4 = 0;
            do {
                if (number4 % 2 == 0) {
                    sum++;

                    System.out.print(number4 + " , ");
                }
                number4++;
            } while (number4 < 100);
            System.out.println();

            System.out.println(sum);


        }

    }

