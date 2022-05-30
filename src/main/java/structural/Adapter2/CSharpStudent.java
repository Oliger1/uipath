package structural.Adapter2;

public class CSharpStudent implements Student{
    private String fullName;
    private double grade;

    public CSharpStudent(String fullName, double grade) {
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

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void displayFullName() {
        System.out.println("Emri i studentit te kursit C#: "+ fullName);
    }

    @Override
    public void displayGrade() {
        System.out.println("Nota e studentit "+fullName +" eshte "+ grade);
    }
}
