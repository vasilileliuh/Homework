package world;

public class Person {
    // properties
    private String fullName;
    private char gender;
    private int age;

    // constructor
    public Person(String fullName, char gender, int age) {
        this.fullName = fullName;
        setGender(gender);
        setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getGender() {
        return gender;
    }

    private void setGender(char gender) {
        if (gender == 'm' || gender == 'f')
            this.gender = gender;
        else
            System.err.println("Third gender does not exists!");
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 13 || age > 250)
            System.err.println("Wrong age number!");
        else
            this.age = age;
    }

    public void printInfo() {
        System.out.printf("%s: %c, %d years%n", fullName, gender, age);
    }
}

