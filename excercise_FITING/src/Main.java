import java.util.Scanner;

 class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Write a number >");
        Integer a = in.nextInt();


        if (a > -128 && a < 127){
            System.out.println(a + " fits in byte");
        }

        if (a > -32768 && a < 32768){
            System.out.println(a + " fits in short");
        }

        if (a > Integer.MIN_VALUE && a < Integer.MAX_VALUE){
            System.out.println(a + " fits in int");
        }

        if (a > Long.MIN_VALUE && a < Long.MAX_VALUE){
            System.out.println(a + " fits in long");
        }



    }
}
