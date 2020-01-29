public class Student {
    String fullName;
    String specialty;
    Float grade;

    Student(String fullName, String specialty, Float grade) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                " fullName= " + "\'" + fullName + "\'" +
                " specialty= " + "\'" + specialty + "\'" +
                " grade= " + "\'" + grade + "\'" + "}";
    }


}
