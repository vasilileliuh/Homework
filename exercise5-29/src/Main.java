public class Main {

    public static void main(String[] args) {

        int day = 1;
        for (int i=1; i<=12; i++){

            System.out.println();
            String dayNumber = new String();

        switch (i) {

            case 1:
                dayNumber = "first";
                break;
            case 2:
                dayNumber = "second";
                break;
            case 3:
                dayNumber = "third";
                break;
            case 4:
                dayNumber = "fourth";
                break;
            case 5:
                dayNumber = "fifth";
                break;
            case 6:
                dayNumber = "sixth";
                break;
            case 7:
                dayNumber = "seventh";
                break;
            case 8:
                dayNumber = "eight";
                break;
            case 9:
                dayNumber = "ninth";
                break;
            case 10:
                dayNumber = "tenth";
                break;
            case 11:
                dayNumber = "eleven";
                break;
            case 12:
                dayNumber = "twelve";
                break;
        }
            System.out.println("On the " + dayNumber + " day of Christmas");
            System.out.println("My true love gave to me");

//            char firstLetter;

        switch (i){

            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a milking");
            case 7:
                System.out.println("Seven swans a swimming");
            case 6:
                System.out.println("Six geese a laying");
            case 5:
                System.out.println("Five gold rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves");
                System.out.print("And ");
            case 1:
//                if (i == 1) {
//                     firstLetter = 'A';
//                }else firstLetter = 'a';
                char firstLetter = i == 1 ? 'A' : 'a';
                System.out.println(firstLetter + " partridge in a pear tree");
                break;
            }

        }
    }
}
