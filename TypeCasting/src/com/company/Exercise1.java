package com.company;

class Exercise1 {

    private static final float YEARS_OF_STUDY = 5;

    private int yearOneMark;
    private int yearTwoMark;
    private int yearThreeMark;
    private int yearFourMark;
    private int yearFiveMark;

    Exercise1(int yearOneMark, int yearTwoMark, int yearThreeMark, int yearFourMark, int yearFiveMark) {
        this.yearOneMark = yearOneMark;
        this.yearTwoMark = yearTwoMark;
        this.yearThreeMark = yearThreeMark;
        this.yearFourMark = yearFourMark;
        this.yearFiveMark = yearFiveMark;
    }

    static float averageMark(Exercise1 student) {
        return (student.yearOneMark + student.yearTwoMark + student.yearThreeMark + student.yearFourMark + student.yearFiveMark) / YEARS_OF_STUDY;
    }

}
