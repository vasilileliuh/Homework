package com.company;

public class Deer {

        public final static String GENUS = "Wild animal";

        private String name = "unknown";
        private int ageInYears;
        private String color;
        private String breed;

        {
            System.out.println(name + " deer is being caught!");
        }

        public Deer() {
            this("Bamby", 5, "Brown", "cartoons");
        }

        public Deer(String name, int ageInYears) {
            this(name, ageInYears, "Brown", "cartoons");
        }

        public Deer(String name, int ageInYears, String color, String breed) {
            this.name = name;
            this.ageInYears = ageInYears;
            this.color = color;
            this.breed = breed;

        }

        public void roar() {
            System.out.println(name + " > Woou Woou!");
        }

        public void jump() {
            System.out.println(name + " > Jumping...");
        }

        public void findFood(String food) {
            System.out.println(name + " finding " + food.toLowerCase());
        }

        public void findFood(String food, int timesPerDay) {
            for (int i = 1; i <= timesPerDay; i++) {
                System.out.println(name + " > finding " + food.toLowerCase() + " #" + i);
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAgeInYears() {
            return ageInYears;
        }

        public void setAgeInYears(int ageInYears) {
            this.ageInYears = ageInYears;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public String toString(){
            return "Tree{" +
                    "Name = '" + name + '\'' +
                    ", Age in years = '" + ageInYears + '\'' +
                    ", Color = '" + color + '\'' +
                    ", Breed = '" + breed + '\'' + "}";

        }


    }


