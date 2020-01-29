import java.util.ArrayList;

public class Application {

    private final static float EIGHT_MARK = 8f;

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John Vanar", "Dev", 8.59f));
        students.add(new Student("Bob Dilan", "QA", 7.5f));
        students.add(new Student("Bill Gates", "PM", 8.9f));
        students.add(new Student("Ken Barber", "Math", 9.72f));
        students.add(new Student("Sandra Bullock", "Dev", 7.24f));

        int indexOfTheBest = 0;
        float bestStudentGrade = 0;

        for (Student student : students) {
            if (student.grade > bestStudentGrade) {
                bestStudentGrade = student.grade;
                indexOfTheBest = students.indexOf(student);
            }
        }
        students.get(indexOfTheBest).grade += 0.1f;
        students.get(indexOfTheBest).grade = Math.round(students.get(indexOfTheBest).grade * 100) / 100f;

        ArrayList<Student> bestStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.grade > EIGHT_MARK)
                bestStudents.add(student);
        }

        printArray(students);
        System.out.println("\nList of the best students: \n");
        printArray(bestStudents);

    }

    private static void printArray(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}