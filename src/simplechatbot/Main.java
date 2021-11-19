package simplechatbot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");

        String name = in.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders of divinding your age by 3, 5, 7.");

        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number = in.nextInt();

        for(int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        for(boolean isRight = false; !isRight ;){

            int ans = in.nextInt();

            if(ans == 2){
                System.out.println("Congratulations, have a nice day!");
                isRight = true;
            }
            else{
                System.out.println("Please, try again.");
            }
        }
    }
}
