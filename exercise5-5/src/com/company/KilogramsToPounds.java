package com.company;

public class KilogramsToPounds {

    public static void main(String[] args) {
        System.out.println("Kilograms    Pounds    |     Pounds      Kilograms");
        int k=20;
        for(int i=1; i <=199; i+=2){
            double j = i*2.2;
            double l = k*0.453592;
            System.out.printf("%-15d%4.1f    |     %-13d%8.2f\n",i,j,k,l);
            k+=5;
        }
    }
}
