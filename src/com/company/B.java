package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {


        /*System.out.println("Hello\nMaksym Kozlov");*/
        /*System.out.println(74+36);*/
        /*System.out.println(50/3);*/
        /*System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);*/

/*        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        String num1 = in.next();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("5 * 5 = " + Integer.parseInt(num1) * num2);*/



/*            for (int i = 1; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (j != i && k != j && k != i)
                            System.out.println("" + i + j + k);
                    }
                }
            }
        }*/
        /*for (int n = 100; n < 999; n++) {
            String s = n.ToString();
            if (s[0] != s[1] && s[1] != s[2] && s[0] != s[2])
                System.out.println(s + " ");
        }


    }*/



        //Ex1//

/*        Scanner in = new Scanner(System.in);
        System.out.print("Your name? ");
        String name = in.nextLine();
        System.out.print("Hello " + name);*/


        //Ex2//


           Scanner vvod = new Scanner(System.in);
            for (int i = 0; true; i++) {
                StringBuffer toll = new StringBuffer(vvod.nextLine());
                toll.reverse();
                System.out.println("В обратном порядке " + toll.toString());

                //Ex3//

                

        }
    }
}
