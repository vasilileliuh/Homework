public class Main {

    public static void main(String[] args) {

        System.out.println("Miles    Kilometers    |     Kilometers      Miles");
        int k=20;
        for(int i=1; i <=10; i++){
            double j = i*1.609;
            double l = k/1.609;
            System.out.printf("%-9d%-10.3f    |     %-14d%8.3f\n",i,j,k,l);
            k+=5;
        }
    }
}

