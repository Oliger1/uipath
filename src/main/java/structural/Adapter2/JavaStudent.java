package structural.Adapter2;

public class JavaStudent implements Student{
    private String fullName;
    private int grade;

    public JavaStudent(String fullName, int grade) {
        this.fullName = fullName;
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void displayFullName() {
        System.out.println("Emri i studentit te kursit Java: "+ fullName);
    }

    @Override
    public void displayGrade() {
        System.out.println("Nota e studentit "+fullName +" eshte "+ grade);
    }
}
