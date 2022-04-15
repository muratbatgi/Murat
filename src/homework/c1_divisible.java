package homework;

public class c1_divisible {
    public static void main(String[] args) {

//  3. check if 350 is divisible by 2 , 3 , 5 (Check for each number)
//          if it is divisible print : 350 is divisible by 2 true
//          if it is not divisible print : 350 is divisible by 2 fals
        int number = 350;
        int n1 = 2;
        int n2 = 3;
        int n3 = 5;
        System.out.println(350%2 +" Reminder For 2"); //Reminder 0
        System.out.println(350%3 +" Reminder For 3"); //Reminder 0
        System.out.println(350%5 +" Reminder For 5"); //Reminder 0


        boolean bo1 = 350 != 2; // true
        boolean bo2 = 350 == 3; // false
        boolean bo3 = 350 == 5; // true

        System.out.println(number + " is divisible bye 2 :" + bo1);
        System.out.println(number + " is divisible bye 3 :" + bo2);
        System.out.println(number + " is divisible bye 5 : " + bo3);
    }
}
