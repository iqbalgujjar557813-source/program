public class StudentGrade {
    private int grade;

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        StudentGrade student = new StudentGrade();
        student.setGrade(90);
        System.out.println(student.getGrade());
    }
}
