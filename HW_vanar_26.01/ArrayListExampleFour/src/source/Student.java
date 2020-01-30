package source;

public class Student {
    private String fullName;
    private String specialty;
    private Float grade;

    protected Student() {
    }

    protected Student(String fullName, String specialty, Float grade) {
        if (fullName != null)
            this.fullName = fullName;
        if (specialty != null)
            this.specialty = specialty;
        this.grade = grade;
    }

    protected Float getGrade() {
        return grade;
    }

    protected void setGrade(Float grade) {
        if (grade > 0 && grade <= 10)
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
