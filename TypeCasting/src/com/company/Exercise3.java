package com.company;

class Exercise3 {

    private static final int MIN_CERTIFIED_THEORY_HOURS = 100;
    private static final int MIN_CERTIFIED_SUCCESSFUL_EXERCISES = 84;
    private static final int MIN_EXAM_MARK = 7;


    private int theoryHours, successfulExercises, examMark;

    Exercise3(int theoryHours, int successfulExercises, int examMark) {
        this.theoryHours = theoryHours;
        this.successfulExercises = successfulExercises;
        this.examMark = examMark;
    }

    static boolean isCertified(Exercise3 student) {
        return (MIN_CERTIFIED_THEORY_HOURS <= student.theoryHours)
                && (MIN_CERTIFIED_SUCCESSFUL_EXERCISES <= student.successfulExercises)
                && (MIN_EXAM_MARK <= student.examMark);
    }
}
