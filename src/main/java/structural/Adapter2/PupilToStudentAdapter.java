package structural.Adapter2;

public class PupilToStudentAdapter implements Student{
    Pupil pupil;
    public PupilToStudentAdapter(Pupil pupil)
    {
        this.pupil = pupil;
    }
    @Override
    public void displayFullName() {
        System.out.println("Emri i nxenesit eshte: "+ pupil.getName() + " " + pupil.getSurname());
    }

    @Override
    public void displayGrade() {
        //duke qene se eshte nxenes i fillores duhet te bejme llogaritjen e notes me sistemin 5-10
        var grade = pupil.getMark() + 5;
        System.out.println("Nota e nxenesit eshte: "+grade);
    }
}
