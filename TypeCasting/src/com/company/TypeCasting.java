package com.company;

public class TypeCasting {

    public static void main(String[] args) {
        System.out.println("Exercise1 result: ");
        Exercise1 studentPetrov = new Exercise1(10, 9, 8, 10, 9);
        System.out.println(Exercise1.averageMark(studentPetrov) + "\n");

        System.out.println("Exercise2 result: ");
        Exercise2 car1 = new Exercise2(200, 160);
        Exercise2 car2 = new Exercise2(210, 150);
        System.out.printf("The road takes " + Exercise2.neededTimeInHours(car1) +"h " + Exercise2.neededExtraTimeInMinutes(car1) + "m.%n");
        System.out.printf("The road takes " + Exercise2.neededTimeInHours(car2) +"h " + Exercise2.neededExtraTimeInMinutes(car2) + "m.%n%n");

        System.out.println("Exercise3 result: ");
        Exercise3 studentIvanov = new Exercise3(100, 75, 8);
        Exercise3 studentTitov = new Exercise3(150, 97,7);
        System.out.println("Certified Ivanov - " + Exercise3.isCertified(studentIvanov) + "!");
        System.out.println("Certified Titov - " + Exercise3.isCertified(studentTitov) + "!\n");

        System.out.println("Exercise4 result: ");
        System.out.println("float type: " + Exercise4.f);
        System.out.println("double type: " + Exercise4.g + "\n");

        System.out.println("Exercise5 result: ");
        System.out.println(Exercise5.resultA);
        System.out.println(Exercise5.resultB);
    }
}

