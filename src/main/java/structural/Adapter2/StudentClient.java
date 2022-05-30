package structural.Adapter2;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public static void main(String[] args) {
        Student javaStudent = new JavaStudent("Albi Mani", 8);
        Student cSharpStudent = new CSharpStudent("Genti Iba", 9);
        Pupil pupil = new Pupil("Era","Popi", 5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(javaStudent);
        studentList.add(cSharpStudent);
        // objektin pupil nuk mund ta fusim ne listen e studenteve sepse nuk eshte student
        //studentList.add(pupil);
        PupilToStudentAdapter pupilAdapter = new PupilToStudentAdapter(pupil);
        studentList.add(pupilAdapter);

        for(Student student: studentList)
        {
            student.displayFullName();
            student.displayGrade();
            System.out.println("-------------");
        }

    }
}
