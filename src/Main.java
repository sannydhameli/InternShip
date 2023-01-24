import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {

        System.out.println("Hello world! This is Game");

        System.out.println("Gusse The Number Between 1 to 100");

        Scanner sc = new Scanner(System.in);

        int num1 = (int)(Math.random()*100);
        int num2 = 0;


        do {
            System.out.println("Enter your Number: ");
            num2 = sc.nextInt();

            if(num2==num1)
            {
                System.out.println("Done you are Win");
                break;
            }
            else if(num2> num1)
            {
                System.out.println("Your number is  so Big");
            }
            else
            {
                System.out.println("Your number is too Small");
            }
        }while(num2 >=0);

        if(num2 < 0)
        {
            System.out.println("Sorry you are Loose The Game!!");
        }

        System.out.println("My number is  : " + num1);

    }
}


