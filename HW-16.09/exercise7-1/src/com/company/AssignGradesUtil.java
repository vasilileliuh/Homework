package com.company;

public class AssignGradesUtil {

    static int findBestScore(int[] studentsScore) {
        int bestScore = 0;
        for (int i = 0; i < studentsScore.length; i++) {
            if (bestScore < studentsScore[i])
                bestScore = studentsScore[i];
        }
        return bestScore;
    }

    static char findGradeLetter(int studentsScore, int bestScore) {
        if (studentsScore >= bestScore - 10)
            return 'A';
        else if (studentsScore >= bestScore - 20)
            return 'B';
        else if (studentsScore >= bestScore - 30)
            return 'C';
        else if (studentsScore >= bestScore - 40)
            return 'D';
        else
            return 'F';
    }
}
