public class Main {

    public static void main(String[] args) {

        int product = 1;
        for (int i=1; i<=15; i+=2){
               product *= i;

            System.out.println("The product of all integers 1-15 is: " + product);
            System.out.println(i);
        }


    }
}
