package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

                System.out.println();

                Scanner in = new Scanner(System.in);
                System.out.print("Enter a number within the range of 1 through 10: ");
                byte number = in.nextByte();

                switch (number){
                    case 1:
                        System.out.print("The Roman numeral version of this number is: I\n");
                        break;
                    case 2:
                        System.out.print("The Roman numeral version of this number is: II\n");
                        break;
                    case 3:
                        System.out.print("The Roman numeral version of this number is: III\n");
                        break;
                    case 4:
                        System.out.print("The Roman numeral version of this number is: IV\n");
                        break;
                    case 5:
                        System.out.print("The Roman numeral version of this number is: V\n");
                        break;
                    case 6:
                        System.out.print("The Roman numeral version of this number is: VI\n");
                        break;
                    case 7:
                        System.out.print("The Roman numeral version of this number is: VII\n");
                        break;
                    case 8:
                        System.out.print("The Roman numeral version of this number is: VIII\n");
                        break;
                    case 9:
                        System.out.print("The Roman numeral version of this number is: IX\n");
                        break;
                    case 10:
                        System.out.print("The Roman numeral version of this number is: X\n");
                        break;
                    default:
                        System.out.print("Entered wrong number");
                }
    }
}
